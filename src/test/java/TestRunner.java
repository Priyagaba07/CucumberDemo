import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features ="src/test/java/Features",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:results.html"},
        dryRun = false


)
public class TestRunner {
}
