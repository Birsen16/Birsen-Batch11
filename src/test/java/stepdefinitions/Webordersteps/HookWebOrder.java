package stepdefinitions.Webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class HookWebOrder {
    WebDriver driver=DriverHelper.getDriver();
    @Before//we use navigation to website or initiliazing your webdriver
    public void beforeScenario(){
        driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    }
    @After//we tear down the firiver under this. WE TAKE SCREENSHOT UNDER THIS ANNATATION.
    public void afterScenario(){
        DriverHelper.tearDown();
        System.out.println("it runs after eachScenario");
    }
    //NOTE: I would definitaely store my hook class under hte step definition package of project.(Webordersteps-->Hook)
}
/*
 WebDriver driver=DriverHelper.getDriver();

    @Before  //this needs to come from junit
    public void beforeScenario(){
    driver.navigate().to(ConfigReader.readProperty("producturl"));
    }
 */
