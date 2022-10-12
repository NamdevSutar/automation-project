package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.LoginActions;

public class LoginSteps {
    WebDriver driver;
    LoginActions loginActions;

    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions = loginActions;
    }
    @Given("open application in url browser")
    public void open_application_in_url_browser() {
       driver.get("https://demo.guru99.com/V1/");
    }
    @When("Enter userid is {string} and password is {string}")
    public void enter_userid_is_and_password_is(String userId, String password) {
       loginActions.userId(userId);
       loginActions.password(password);
    }
    @When("click the login button")
    public void click_the_login_button() {
       loginActions.clickOnLogin();
    }
    @Then("login should be successfuly")
    public void login_should_be_successfuly() {
        System.out.println("login should be successfuly");
    }



}
