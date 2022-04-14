package stepdefinitions.paylocitysteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.paylocitypages.PayloCityLoginPage;
import pages.paylocitypages.PayloCityMainPage;
import utils.DriverHelper;

import java.util.Map;

public class PayloCitySteps {
    WebDriver driver = DriverHelper.getDriver();
    PayloCityLoginPage payloCityLoginPage=new PayloCityLoginPage(driver);
    PayloCityMainPage payloCityMainPage=new PayloCityMainPage(driver);

    @Given("the user logins in to Paylocity with following credentials")
    public void the_user_logins_in_to_paylocity_with_following_credentials(DataTable dataTable) {
        Map<String,String> loginmap=dataTable.asMap();
        payloCityLoginPage.setLoginButton(loginmap.get("username"),loginmap.get("password"));
    }

    @When("the user registers a new employee with following information")
    public void the_user_registers_a_new_employee_with_following_information(DataTable dataTable) {
        Map<String,String> createNewEmployeeMap=dataTable.asMap();
        payloCityMainPage.addNewEmployee(createNewEmployeeMap.get("FirstName"),createNewEmployeeMap.get("LastName"),createNewEmployeeMap.get("Dependants"));

    }
    @Then("the user valitdates employee name is on the table")
    public void the_user_valitdates_employee_name_is_on_the_table(DataTable dataTable) {
        Map<String,String> nameValidation=dataTable.asMap();
        Assert.assertEquals(payloCityMainPage.getFirstName(),nameValidation.get("FirstName"));
        Assert.assertEquals(payloCityMainPage.getLastName(),nameValidation.get("LastName"));
    }
    @Then("the benefit cost calculations are correct")
    public void the_benefit_cost_calculations_are_correct() {

    }
    //second step
    @Given("the user logins in to Paylocity with following username and password")
    public void the_user_logins_in_to_paylocity_with_following_username_and_password(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> loginmap=dataTable.asMap();
        payloCityLoginPage.setLoginButton(loginmap.get("username"),loginmap.get("password"));
    }
    @When("the user registers a disconted new employee with following information!")
    public void the_user_registers_a_disconted_new_employee_with_following_information(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> createNewEmployeeMap=dataTable.asMap();
        payloCityMainPage.addNewEmployee(createNewEmployeeMap.get("FirstName"),createNewEmployeeMap.get("LastName"),createNewEmployeeMap.get("Dependants"));

    }
    @Then("the user validates discounted employee in the table!")
    public void the_user_validates_discounted_employee_in_the_table(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> nameValidation=dataTable.asMap();
        Assert.assertEquals(payloCityMainPage.getFirstName(),nameValidation.get("FirstName"));
        Assert.assertEquals(payloCityMainPage.getLastName(),nameValidation.get("LastName"));

    }
    @Then("the user validates employee has a {int}% discount")
    public void the_user_validates_employee_has_a_discount(Integer int1) {

    }
    //step3
    @When("the user select the Action Edit")
    public void the_user_select_the_action_edit() {

    }
    @When("the user can edit employee details")
    public void the_user_can_edit_employee_details() {

    }
    @Then("the data should change in the table")
    public void the_data_should_change_in_the_table() {

    }
    //step4
    @When("the user click the Action X")
    public void the_user_click_the_action_x() {

    }
    @Then("the employee should be deleted.")
    public void the_employee_should_be_deleted() {

    }



}
