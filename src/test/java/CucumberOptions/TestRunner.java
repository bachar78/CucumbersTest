package CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Login.feature"},
        glue = "stepDefinations"
)
public class TestRunner {
}
