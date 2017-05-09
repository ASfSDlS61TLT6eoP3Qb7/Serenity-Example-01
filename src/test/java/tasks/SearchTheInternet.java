package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import targets.GooglePageTarget;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTheInternet implements Task {

    private final String keyword;

    protected SearchTheInternet(String keyword) {
        this.keyword = keyword;
    }

    @Step("Search the Internet for {0}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("http://www.google.nl/"),
                Enter.theValue(keyword).into(GooglePageTarget.QUERY_FIELD).thenHit(Keys.ENTER)
        );
    }

    public static Performable forKeyword(String forKeyword) {
        return instrumented(SearchTheInternet.class, forKeyword);
    }
}
