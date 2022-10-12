package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.NewAccountElements;
import stepDefinitions.CommonSteps;

public class NewAccountActions {
    private WebDriver driver;
    NewAccountElements newAccountElements;

    public NewAccountActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newAccountElements = new NewAccountElements(driver);
    }
    public void enterCustomerId(String customerId){
        newAccountElements.customerId.sendKeys(customerId);
    }
    public void enterAccountType(String accountType){
        newAccountElements.accountType.sendKeys(accountType);
    }
    public void initialDeposit(String initialDeposit){
        newAccountElements.initialsDeposit.sendKeys(initialDeposit);
    }
    public void clickOnButton(String suubmit){
        newAccountElements.submit.click();
    }

}
