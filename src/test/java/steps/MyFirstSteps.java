package steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pageobjects.GoogleHomePage;

public class MyFirstSteps {

    @Managed
    WebDriver driver;

    GoogleHomePage googleHomePage;

    @Step("take my first step")
    public void take_my_first_step() {
        System.out.println("Take my first step.");
    }

    @Step("Go to url")
    public void go_to(String url) {
        googleHomePage.open();
    }

    @Step
    public void openGoogleHomepage() {
        googleHomePage.open();
    }

    @Step
    public void openGoogleWithActor() {
        Actor mark = Actor.named("mark");
        mark.can(BrowseTheWeb.with(driver));
        mark.attemptsTo(Open.url("http://www.google.nl/"));
    }
}
