import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import questions.TheSearchResults;
import steps.MyFirstSteps;
import tasks.OpenGoogle;
import tasks.SearchTheInternet;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class TestWithScreenplayPattern {

    @Managed
    WebDriver browser;

    @Steps
    MyFirstSteps myFirstSteps;

    @Test
    @Title("Test case title of a screenplay pattern test")
    @Issues({"JIRA-001", "JIRA-002"})
    public void testCaseWithScreenplayPattern() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(browser));

        mark.attemptsTo(Open.url("http://www.google.nl/"));
    }

    @Test
    public void openGoogleWithActorInStep() {
        myFirstSteps.openGoogleWithActor();
    }

    @Test public void testCase2() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(browser));

        givenThat(mark).wasAbleTo(OpenGoogle.onTheHomePage());
    }

    @Test public void testCase3() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(browser));

        givenThat(mark).wasAbleTo(SearchTheInternet.forKeyword("Tralalala"));
    }

    @Test
    @Pending
    public void testWithMultipleActors() {
        Actor jan = Actor.named("Jan");
        jan.can(BrowseTheWeb.with(browser));

        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(browser));

        givenThat(jan).wasAbleTo(SearchTheInternet.forKeyword("Tralalala"));
        givenThat(mark).wasAbleTo(SearchTheInternet.forKeyword("Tralalala"));
    }

    @Test
    @WithTag("Current")
    public void testScreenplaySuccess() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(browser));

        givenThat(mark).wasAbleTo(SearchTheInternet.forKeyword("Mark Henneman"));
        then(mark).should(seeThat(TheSearchResults.resultStatistics(), containsString("Ongeveer 239.000 resultaten")));

    }

    @Test
    @WithTag("Current")
    public void testScreenplayFail() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(browser));

        givenThat(mark).wasAbleTo(SearchTheInternet.forKeyword("Het Internet"));
        then(mark).should(seeThat(TheSearchResults.resultStatistics(), containsString("Ongeveer 239.000 resultaten")));

    }
}
