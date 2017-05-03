package tasks.targets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GooglePageTarget extends PageObject {

    public static Target QUERY_FIELD = Target.the("Keyword Query Field").located(By.name("q"));
}
