package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.DeleteAccountActions;

public class DeleteAccountSteps {
    WebDriver driver;

    DeleteAccountActions deleteAccountActions;

    public DeleteAccountSteps(CommonSteps commonSteps, DeleteAccountActions deleteAccountActions) {
        this.driver = commonSteps.getDriver();
        this.deleteAccountActions = deleteAccountActions;
    }

    @Given("Open the applications in a url browser")
    public void open_the_applications_in_a_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/deleteAccountInput.php");
    }

    @When("enter the account number is {string}")
    public void enter_the_account_number_is(String accountNumber) {
        deleteAccountActions.accountNumber(accountNumber);
    }

    @Then("account delete should be successful")
    public void account_delete_should_be_successful() {
        System.out.println("account delete should be successful");
    }

    @When("click on the submit button")
    public void click_on_the_submit_button() {
        System.out.println("click on the submit button");

    }
}