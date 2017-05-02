import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MyFirstSerenityTest {

    @Test
    public void testCase001() {
        System.out.println("Hello World!");
    }
}
