package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenGoogle implements Task{

    @Step("Open the Google HomePage")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("http://www.google.nl/"));
    }

    public static Performable onTheHomePage() {
        return instrumented(OpenGoogle.class);
    }
}
