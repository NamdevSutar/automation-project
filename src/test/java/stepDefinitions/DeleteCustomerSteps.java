package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.DeleteCustomerActions;

public class DeleteCustomerSteps {
    WebDriver driver;

    DeleteCustomerActions deleteCustomerActions;

    public DeleteCustomerSteps(CommonSteps commonSteps, DeleteCustomerActions deleteCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.deleteCustomerActions = deleteCustomerActions;
    }
    @Given("open a application in url browser")
    public void open_a_application_in_url_browser() {
       driver.get("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
    }
    @When("enter the cutomerId is {string} and click the submit button")
    public void enter_the_cutomer_id_is_and_click_the_submit_button(String customerId) {
       deleteCustomerActions.enterCustomerId(customerId);
    }
    @Then("delete customer should be sucessful")
    public void delete_customer_should_be_sucessful() {
        System.out.println("delete customer should be sucessful");
    }
}
