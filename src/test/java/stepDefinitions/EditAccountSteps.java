package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.EditAccountActions;
import pageActions.EditCustomerActions;

public class EditAccountSteps {
    WebDriver driver;
    EditAccountActions editAccountActions;

    public EditAccountSteps(CommonSteps commonSteps, EditAccountActions editAccountActions) {
        this.driver = commonSteps.getDriver();
        this.editAccountActions = editAccountActions;
    }
    @Given("Open the a applicatioin in url browser")
    public void open_the_a_applicatioin_in_url_browser() {
       driver.get("https://demo.guru99.com/V1/html/editAccount.php");
    }
    @When("Fill the account number\"{int}\"")
    public void fill_the_account_number(Integer accountNumber) {
       editAccountActions.accountNumber(String.valueOf(accountNumber));
    }
    @Then("Click on submit button")
    public void click_on_submit_button() {
        System.out.println("Click on submit button");
    }

}
