package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.LoginElements;
import stepDefinitions.CommonSteps;

public class LoginActions {
    private WebDriver driver;

    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }
    public void userId(String userId){
        loginElements.userId.sendKeys(userId);
    }
    public void password(String password){
        loginElements.password.sendKeys(password);
    }
    public void clickOnLogin(){
        loginElements.loginButton.click();
    }
}
