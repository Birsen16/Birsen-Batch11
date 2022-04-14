package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverHelper {
    //private variable-->we do not want anybody to create a object of it(instantiate)
    private static WebDriver driver;
    //Private constructor we can ensure that no more than one object can be created at a time.
    // By providing a private constructor you prevent class instances from being created in any place other than this very class.
    //from this class
    private DriverHelper(){}

    public static WebDriver getDriver(){

        if(driver==null){//I am checking driver whether it is null or not.
            //if driver is null I am going to create a new one
            //if not,It is not going to create a new Driver.It will use the existing(current) one.
            switch (ConfigReader.readProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();//for fresh start(testing)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            //your driver will wait max 5 sec

        }
        return driver;
    }
    public static void tearDown(){
       // driver.quit();
        driver=null;
    }
}