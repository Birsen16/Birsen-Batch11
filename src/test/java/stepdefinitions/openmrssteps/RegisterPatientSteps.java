package stepdefinitions.openmrssteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.OpenMrsLoginPages.OpenMrsLoginPage;
import pages.OpenMrsLoginPages.OpenMrsMainPage;
import pages.OpenMrsLoginPages.OpenMrsRegisterPage;
import utils.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {
    WebDriver driver = DriverHelper.getDriver();
    OpenMrsLoginPage openMrsLoginPage = new OpenMrsLoginPage(driver);
    OpenMrsMainPage openMrsMainPage = new OpenMrsMainPage(driver);
    OpenMrsRegisterPage openMrsRegisterPage = new OpenMrsRegisterPage(driver);


    @Given("the user logs in to OpenMRS with following credentials")
    public void the_user_logs_in_to_open_mrs_with_following_credentials(DataTable dataTable) {
        //you should know that " dataTable will comes as a parameter when you provide data table in
        //the feature file and delete the first part of the Datatable and import it.
        Map<String, String> usernamePasswordMap = dataTable.asMap();
        //username=admin
        //password=Admin123
//       String name = usernamePasswordMap.get("username");
//       String password = usernamePasswordMap.get("password");
//        System.out.println(name);//admin
//        System.out.println(password);//Admin123

        openMrsLoginPage.login(usernamePasswordMap.get("username"), usernamePasswordMap.get("password"));
    }

    @When("the user registers a new patient with following information:")
    public void the_user_registers_a_new_patient_with_following_information(DataTable dataTable) throws InterruptedException {

        Map<String, String> patientInfoMap = dataTable.asMap();

        openMrsMainPage.clickRegisterPatientButton();

        openMrsRegisterPage.sendName(patientInfoMap.get("GivenName"), patientInfoMap.get("FamilyName"));
        openMrsRegisterPage.sendGender(patientInfoMap.get("Gender"));
        openMrsRegisterPage.sendBirthDate(patientInfoMap.get("Day"), patientInfoMap.get("Month"), patientInfoMap.get("Year"));
        openMrsRegisterPage.sendAddress(patientInfoMap.get("Address"));
        openMrsRegisterPage.sendPhoneNumber(patientInfoMap.get("PhoneNumber"));
        openMrsRegisterPage.sendRelativeInfo(patientInfoMap.get("RelationType"), patientInfoMap.get("RelativeName"));
        openMrsRegisterPage.clickConfirmButton();

    }

    @Then("the user validate the patient name and familyName")
    public void the_user_validate_the_patient_name_and_family_name(DataTable dataTable) {
        Map<String, String> validateNames = dataTable.asMap();
        Assert.assertEquals(validateNames.get("GivenName"), openMrsRegisterPage.getGivingName());
        Assert.assertEquals(validateNames.get("FamilyName"), openMrsRegisterPage.getFamilyName());
    }
}
