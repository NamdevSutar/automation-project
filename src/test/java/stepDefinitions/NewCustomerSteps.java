package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.NewCustomerActions;

public class NewCustomerSteps {
    WebDriver driver;
    NewCustomerActions newCustomerActions;

    public NewCustomerSteps(CommonSteps commonSteps, NewCustomerActions newCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.newCustomerActions = newCustomerActions;
    }

    @Given("Open application url in browser")
    public void open_application_url_in_browser() {
       driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
    }

    @When("Add the customer name {string}")
    public void add_the_customer_name(String customerName) {
        newCustomerActions.CustomerName(customerName);
    }

    @When("Click on Gender {string}")
    public void click_on_gender(String string) {
        newCustomerActions.clickOnButton();
    }
    @When("fill the Date of birth {string}")
    public void fill_the_date_of_birth(String dateOfBirth) {
        newCustomerActions.dateOfBirth(dateOfBirth);
    }
    @When("fill the Address {string},and city is {string}")
    public void fill_the_address_and_city_is(String address, String city) {
        newCustomerActions.enterAddress(address);
        newCustomerActions.enterCity(city);
    }
    @When("fill the state is {string} and pin code is {string}")
    public void fill_the_state_is_and_pin_code_is(String state, String pinCode) {
        newCustomerActions.enterState(state);
        newCustomerActions.enterPinCode(pinCode);
    }
    @When("Add the telephone number {string} and add Email id {string}")
    public void add_the_telephone_number_and_add_email_id(String telephoneNumber, String emailId) {
        newCustomerActions.enterTelephoneNumber(telephoneNumber);
        newCustomerActions.enterEmailId(emailId);
    }
    @When("Click the submit button")
    public void click_the_submit_button() {
       newCustomerActions.clickOnButton();
    }
    @Then("Add new customer should be successful")
    public void add_new_customer_should_be_successful() {
        System.out.println("Add new customer should be successful");
    }

}
