package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.MiniStatementActions;

public class MiniStatementSteps {
    WebDriver driver;

    MiniStatementActions miniStatementActions;

    public MiniStatementSteps(CommonSteps commonSteps, MiniStatementActions miniStatementActions) {
        this.driver = commonSteps.getDriver();
        this.miniStatementActions = miniStatementActions;
    }
    @Given("open application in url browsers")
    public void open_application_in_url_browsers() {
        driver.get("https://demo.guru99.com/V1/html/MiniStatementInput.php");

    }
    @When("enter the account no is {string}")
    public void enter_the_account_no_is(String accountNo) {
        miniStatementActions.accountNo(accountNo);

    }
    @When("click the submit buttons")
    public void click_the_submit_buttons() {
        System.out.println("click the submit buttons");
    }
    @Then("mini statement open should be successful")
    public void mini_statement_open_should_be_successful() {
        System.out.println("mini statement open should be successful");
    }

}
