import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MyFirstSteps;
import tasks.OpenGoogle;
import tasks.SearchTheInternet;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@RunWith(SerenityRunner.class)
public class TestWithScreenplayPattern {

    @Managed
    WebDriver firefox;

    @Steps
    MyFirstSteps myFirstSteps;

    @Test
    @Title("Test case title of a screenplay pattern test")
    @Issues({"JIRA-001", "JIRA-002"})
    public void testCaseWithScreenplayPattern() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(firefox));

        mark.attemptsTo(Open.url("http://www.google.nl/"));
    }

    @Test
    public void openGoogleWithActorInStep() {
        myFirstSteps.openGoogleWithActor();
    }

    @Test public void testCase2() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(firefox));

        givenThat(mark).wasAbleTo(OpenGoogle.onTheHomePage());
    }

    @WithTag("Current")
    @Test public void testCase3() {
        Actor mark = Actor.named("Mark");
        mark.can(BrowseTheWeb.with(firefox));

        givenThat(mark).wasAbleTo(SearchTheInternet.forKeyword("Tralalala"));
    }
}
