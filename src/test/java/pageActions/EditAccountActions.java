package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.EditAccountElements;
import pageElements.EditCustomerElements;
import stepDefinitions.CommonSteps;

public class EditAccountActions {
    private WebDriver driver;

    EditAccountElements editAccountElements;

    public EditAccountActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.editAccountElements = new EditAccountElements(driver);
    }
    public void accountNumber(String accountNumber){
        editAccountElements.accountNumber.sendKeys(accountNumber);
    }
    public void clickOnButton(String submit){
        editAccountElements.submit.click();
    }
}
