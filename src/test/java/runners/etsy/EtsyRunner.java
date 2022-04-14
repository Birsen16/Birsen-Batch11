package runners.etsy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.etsy",
        glue = "stepdefinitions/etsysteps",
        dryRun = false,
        tags = "@regression"

        // features= 'ta feature dosyasının content root yolunu çektik
        // glue= 'da steps dosyasının source root yolunu çektik
)

public class EtsyRunner {
//src/test/resources/features/com.etsy/EtsyResearch.feature

}