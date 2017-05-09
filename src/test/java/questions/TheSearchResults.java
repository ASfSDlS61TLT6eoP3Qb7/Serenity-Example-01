package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import pageobjects.SearchResultPage;

@Subject("The number of results is '#itemName'")
public class TheSearchResults implements Question<String> {

    public String answeredBy(Actor actor) {
        Target numberOfResults = SearchResultPage.RESULTS_STATISTICS;

        return Text.of(numberOfResults).viewedBy(actor).asString();
    }

    public static TheSearchResults resultStatistics() {
        return new TheSearchResults();
    }
}
