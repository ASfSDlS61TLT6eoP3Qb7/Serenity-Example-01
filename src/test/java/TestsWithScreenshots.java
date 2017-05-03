import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.BlurScreenshots;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.screenshots.BlurLevel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MyFirstSteps;

@RunWith(SerenityRunner.class)
public class TestsWithScreenshots {

    @Managed
    WebDriver driver;

    @Steps
    MyFirstSteps myFirstSteps;

    @Test
    @BlurScreenshots(value = BlurLevel.HEAVY)
    @WithTag("Current")
    public void testCaseWithBlurryScreenshot() {
        myFirstSteps.openGoogleHomepage();
    }
}
