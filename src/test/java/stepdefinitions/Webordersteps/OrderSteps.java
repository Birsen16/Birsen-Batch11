package stepdefinitions.Webordersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.CreateGroupOrderPage;
import pages.weborderpages.LoginPage;
import pages.weborderpages.OrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderSteps {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);
    OrderPage orderPage=new OrderPage(driver);
    CreateGroupOrderPage createGroupOrderPage=new CreateGroupOrderPage(driver);

    @Given("the user is on weborder homepage")
    public void the_user_is_on_weborder_homepage() {
      driver.navigate().to(ConfigReader.readProperty("weborderurl"));
      loginPage.login(ConfigReader.readProperty("weborderusername"),ConfigReader.readProperty("weborderpassword"));
    }
    @When("the user select {string} options")
    public void the_user_select_options(String deliveryOptions) {
        orderPage.getDeliveryOptions(deliveryOptions);


    }
    @When("the user is on the groupOrderPage")
    public void the_user_is_on_the_group_order_page() {
        orderPage.clickGroupOrder();
        orderPage.clickNextButton();
        Assert.assertEquals(driver.getTitle(),"Create Group Order - Weborder");
    }
    @When("the user send invitees note {string}")
    public void the_user_send_invitees_note(String inviteNote) {
        createGroupOrderPage.sendInviteNote(inviteNote);

    }
    @When("the user send invite list {string} and {string}")
    public void the_user_send_invite_list_and(String email1, String email2) {
        createGroupOrderPage.sendInviteList(email1+","+email2);

    }
    @Then("the user validates the {string} address")
    public void the_user_validates_the_address(String expectedAddress) {
    Assert.assertTrue(createGroupOrderPage.getOfficeAddress().contains(expectedAddress));
    }
    @Then("the user validate {string} text")
    public void the_user_validate_text(String expectedText) throws InterruptedException {
    createGroupOrderPage.clickCreateGroupButton();
    Assert.assertEquals(createGroupOrderPage.getHeaderText(),expectedText);
    }
    @Then("the user validates total participants is {int}")
    public void the_user_validates_total_participants_is(int expectedParticipants) {
    Assert.assertEquals(createGroupOrderPage.getParticipant(),expectedParticipants);
    }

}
