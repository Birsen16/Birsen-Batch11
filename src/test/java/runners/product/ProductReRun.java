package runners.product;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/uiFailedTests.txt",//this is how you run failed tests and this is where is the content root of uiFailedTests.txt underneath the target
        glue = "stepdefinitions/productsteps",
        dryRun = false,
        tags = "@productprojectOutline",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class ProductReRun {

}
