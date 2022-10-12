package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.DeleteCustomerElements;
import stepDefinitions.CommonSteps;

public class DeleteCustomerActions {
    private WebDriver driver;

    DeleteCustomerElements deleteCustomerElements;

    public DeleteCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.deleteCustomerElements = new DeleteCustomerElements(driver);
    }

    public void enterCustomerId(String customerId) {
        deleteCustomerElements.customerId.sendKeys(customerId);
    }

    public void clickOnButton(String submit) {
        deleteCustomerElements.submit.click();
    }
}