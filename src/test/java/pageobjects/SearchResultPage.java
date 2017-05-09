package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultPage extends PageObject{

    public static Target RESULTS_STATISTICS = Target.the("Results field").located(By.id("resultStats"));
}
