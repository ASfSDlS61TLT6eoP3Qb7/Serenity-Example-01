import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SerenityTestsWithTags {

    @Test
    @Issue("JIRA-1024")
    public void testCaseWithAnIssue() {
        System.out.println("Hello World!");
    }

    @Test
    @WithTag(value = "tagValue")
    public void testCaseWithAValueTag() {}

    @Test
    @WithTag("tagValue")
    public void testCaseWithATag() {}

    @Test
    @WithTag(name = "nameTag")
    public void testCaseWithANameTag() {}

    @Test
    @WithTag(type = "typeTag")
    public void testCaseWithATypeTag() {}

    @Test
    @WithTag(type = "typeTag", name = "nameTag")
    public void testCaseWithMultipleTags() {}

    @Test
    @WithTags( {
            @WithTag(value = "tag1"),
            @WithTag(value = "tag2"),
            @WithTag(name = "feature1"),
            @WithTag(name = "feature2")
    } )
    public void testCaseWithMultipleTags2() {}

    @Test
    public void testCaseWithMultipleTags3() {}
}
