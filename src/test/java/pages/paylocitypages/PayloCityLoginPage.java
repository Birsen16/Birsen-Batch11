package pages.paylocitypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PayloCityLoginPage {
    public PayloCityLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='form-username']")
   private WebElement username;

    @FindBy(xpath = "//input[@name='form-password']")
   private WebElement password;

    @FindBy(tagName = "button")
   private WebElement loginButton;


    public void setLoginButton(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();

    }


}
