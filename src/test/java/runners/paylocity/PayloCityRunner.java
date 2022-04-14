package runners.paylocity;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.paylocity",
        glue = "stepdefinitions/paylocitysteps",
        dryRun= false,
        tags = "@firstStep",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class PayloCityRunner {

}
