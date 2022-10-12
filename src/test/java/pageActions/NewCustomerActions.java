package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.NewCustomerElements;
import stepDefinitions.CommonSteps;

public class NewCustomerActions {
    private WebDriver driver;
    NewCustomerElements newCustomerElements;

    public NewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newCustomerElements = new NewCustomerElements(driver);
    }
    public void CustomerName(String customerName) {
        newCustomerElements.customerName.sendKeys(customerName);
    }
    public void clickOnButton() {
        newCustomerElements.clickOnButton();
    }
     public void dateOfBirth(String dateOfBirth){
        newCustomerElements.DateOfBirth(dateOfBirth);
     }
     public void enterAddress(String address){
        newCustomerElements.address.sendKeys(address);

     }
     public void enterCity(String city){
        newCustomerElements.city.sendKeys(city);
     }
     public void enterState(String state){
        newCustomerElements.state.sendKeys(state);
     }
    public void enterPinCode(String pinCode){
        newCustomerElements.pin.sendKeys(pinCode);
    }
    public void enterTelephoneNumber(String telephoneNumber){
        newCustomerElements.telephone.sendKeys(telephoneNumber);
    }
    public void enterEmailId(String emailId){
        newCustomerElements.emailId.sendKeys(emailId);
    }
    }



