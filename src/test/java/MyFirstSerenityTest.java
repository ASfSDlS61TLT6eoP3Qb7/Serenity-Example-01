import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MyFirstSerenityTest {

    @Test
    public void testCase001() {
        System.out.println("Hello World!");
    }

    @Pending
    public void testCase002() {}
}
