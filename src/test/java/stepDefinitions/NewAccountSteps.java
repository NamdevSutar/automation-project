package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.NewAccountActions;

public class NewAccountSteps {
    WebDriver driver;

    NewAccountActions newAccountActions;

    public NewAccountSteps(CommonSteps commonSteps, NewAccountActions newAccountActions) {
        this.driver = commonSteps.getDriver();
        this.newAccountActions = newAccountActions;
    }
    @Given("open the application a url browser")
    public void open_the_application_a_url_browser() {
       driver.get("https://demo.guru99.com/V1/html/addAccount.php");
    }
    @When("Enter customerId is {string}")
    public void enter_customer_id_is(String customerId) {
        newAccountActions.enterCustomerId(customerId);

    }
    @When("Select the account type is savings")
    public void select_the_account_type_is_savings() {
        System.out.println("Select the account type is savings");
    }
    @When("fil the initial deposit is {string}")
    public void fil_the_initial_deposit_is(String initialDeposit) {
        newAccountActions.initialDeposit(initialDeposit);

    }
    @When("Click on submit")
    public void click_on_submit() {
        System.out.println("Click on submit");
    }
    @Then("Open the New account should be successful")
    public void open_the_new_account_should_be_successful() {
        System.out.println("Open the New account should be successful");
    }

}
