package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.DeleteAccountElements;
import stepDefinitions.CommonSteps;

public class DeleteAccountActions {
    private WebDriver driver;

    DeleteAccountElements deleteAccountElements;

    public DeleteAccountActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.deleteAccountElements = new DeleteAccountElements(driver);
    }
    public void accountNumber(String accountNumber){
        deleteAccountElements.accountNumber.sendKeys(accountNumber);
    }
    public void clickOnButton(String submit){
        deleteAccountElements.submit.click();
    }
}
