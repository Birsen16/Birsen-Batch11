package stepdefinitions.openmrssteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HookOpenMrs {
    WebDriver driver= DriverHelper.getDriver();

    @Before  //this needs to come from junit
    public void beforeScenario(){
        driver.navigate().to(ConfigReader.readProperty("openmrsurl"));
    }
    @After
    public void afterScenario(Scenario scenario){
        Date currentData=new Date();
        String screenshotfileName = currentData.toString().replace("","-")
                .replace(":","-");
        if (scenario.isFailed()){
            File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(new File("src/test/java/screenshot/" + screenshotFile) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        DriverHelper.tearDown();
    }


}
