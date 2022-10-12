package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.EditCustomerElements;
import stepDefinitions.CommonSteps;

public class EditCustomerActions {
    private WebDriver driver;

    EditCustomerElements editCustomerElements;

    public EditCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.editCustomerElements = new EditCustomerElements(driver);
    }
    public void enterCustomerId(String customerId){
        editCustomerElements.customerId.sendKeys(customerId);
    }
    public void clickOnButton(String submit) {
        editCustomerElements.submit.click();
    }
}
