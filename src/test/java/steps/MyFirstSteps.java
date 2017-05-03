package steps;

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
}
