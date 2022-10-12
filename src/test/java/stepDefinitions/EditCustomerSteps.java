package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.EditCustomerActions;

public class EditCustomerSteps {
    WebDriver driver;
    EditCustomerActions editCustomerActions;

    public EditCustomerSteps(CommonSteps commonSteps, EditCustomerActions editCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.editCustomerActions = editCustomerActions;
    }
    @Given("Open the application in url browser")
    public void open_the_application_in_url_browser() {
       driver.get("https://demo.guru99.com/V1/html/EditCustomer.php");
    }
    @When("Enter customerId is {string} and click on sumbit button")
    public void enter_customer_id_is_and_click_on_sumbit_button(String customerId) {
       editCustomerActions.enterCustomerId(customerId);
    }
    @Then("customer edit form should be successful")
    public void customer_edit_form_should_be_successful() {
        System.out.println("customer edit form should be successful");
    }

}
