package pages.OpenMrsLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMrsLoginPage {
public OpenMrsLoginPage(WebDriver driver){
    PageFactory.initElements(driver,this);
}
@FindBy(id = "username")
    private WebElement userName;

@FindBy(id = "password")
    private WebElement password;

@FindBy(id = "Inpatient Ward")
    private WebElement InpatientWardButton;

@FindBy(id ="loginButton")
    private WebElement loginButton;

public void login(String username,String password){
    this.userName.sendKeys(username);
    this.password.sendKeys(password);
    InpatientWardButton.click();
    loginButton.click();
}
}
