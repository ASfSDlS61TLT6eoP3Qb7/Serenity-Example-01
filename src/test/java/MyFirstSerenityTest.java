import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SerenityRunner.class)
public class MyFirstSerenityTest {

    @Test
    public void testCase001() {
        int i = 0;
        int j = 1;

        assertThat(i, equalTo(j));
    }

    @Test
    public void testCase002() {}
}
