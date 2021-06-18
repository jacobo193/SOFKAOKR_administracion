package pom.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = {"pom/steps"},
        snippets = SnippetType.CAMELCASE)
public class TestRunnerLogin {
}
