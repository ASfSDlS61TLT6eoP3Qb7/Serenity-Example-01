import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MyFirstSteps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SerenityRunner.class)
public class MyFirstSerenityTest {

    @Managed
    WebDriver driver;

    @Steps
    MyFirstSteps myFirstSteps;

    @Test
    public void testCaseThatWillFail() {
        int i = 0;
        int j = 1;

        assertThat(i, equalTo(j));
    }

    @Test
    @Pending
    public void testCaseThatIsPending() {}

    @Test
    public void testCaseThatWillSucceed() {
        assertThat("One is one",  1 == 1);
    }

    @Test
    @Ignore
    public void testCaseThatIsIgnored() {}

    @Test
    public void testWhichStopsAndStartsWebDriver() {
        myFirstSteps.go_to("http://www.nu.nl/");
    }

    @Test
    public void testScreenshot() {
        driver.navigate().to("http://www.vi.nl/");
        myFirstSteps.take_my_first_step();
    }

    @Test
    public void testIfSerenityClosesBrowserAutomatically() {
        driver.navigate().to("http://www.google.nl");
    }
}
