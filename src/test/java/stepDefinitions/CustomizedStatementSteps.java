package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.CustomizedStatementActions;

public class CustomizedStatementSteps {
    WebDriver driver;

    CustomizedStatementActions customizedStatementActions;

    public CustomizedStatementSteps(CommonSteps commonSteps, CustomizedStatementActions customizedStatementActions) {
        this.driver = commonSteps.getDriver();
        this.customizedStatementActions = customizedStatementActions;
    }
    @Given("Open a application in url browser")
    public void open_a_application_in_url_browser() {
       driver.get("https://demo.guru99.com/V1/html/CustomisedStatementInput.php");
    }
    @When("Enter the account number is {string}")
    public void enter_the_account_number_is(String accountNo) {
        customizedStatementActions.accountNo(accountNo);
    }
    @When("Enter from date {string}")
    public void enter_from_date(String fromDate) {
        customizedStatementActions.fromDate(fromDate);

    }
    @When("Enter To date {string}")
    public void enter_to_date(String toDate) {
       customizedStatementActions.toDate(toDate);
    }
    @When("Enter amount lower limit {string}")
    public void enter_amount_lower_limit(String lowerLimit) {
       customizedStatementActions.lowerLimit(lowerLimit);
    }
    @When("enter the number of transaction is {string}")
    public void enter_the_number_of_transaction_is(String numberOfTransactin) {
        customizedStatementActions.numberOfTransaction(numberOfTransactin);

    }
    @Then("click on the submit buttons")
    public void click_on_the_submit_buttons() {
        System.out.println("click on the submit buttons");
    }


}
