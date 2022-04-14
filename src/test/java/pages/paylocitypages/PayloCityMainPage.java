package pages.paylocitypages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class PayloCityMainPage {
    public PayloCityMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btnAddEmployee")
    WebElement addEmployeeButton;

    @FindBy(xpath = "//label[.='First Name:']//following::input[1]")
    WebElement firstName;

    @FindBy(xpath = "//label[.='First Name:']//following::input[2]")
    WebElement lastName;

    @FindBy(xpath = "//label[.='First Name:']//following::input[3]")
    WebElement dependants;

    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//table[@id='employee-table']//following::tr[3]//following::td[1]")
    WebElement validateFirstName;

    @FindBy(xpath = "//table[@id='employee-table']//following::tr[3]//following::td[2]")
    WebElement validateLastName;


    @FindBy(xpath = "//table//tr//td[5]")
    private List<String> dependencycount;

    @FindBy(xpath = "//table//tr//td[7]")
    private List<String> benefitCost;





    public void addNewEmployee(String firstName,String lastName,String dependants){
        addEmployeeButton.click();
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.dependants.sendKeys(dependants);
        submitButton.click();
    }

    public String getFirstName(){
        return BrowserUtils.getTextMethod(validateFirstName);
    }
    public String getLastName(){
        return BrowserUtils.getTextMethod(validateLastName);
    }

}
