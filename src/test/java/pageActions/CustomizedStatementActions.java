package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.CustomizedStatementElements;
import stepDefinitions.CommonSteps;

public class CustomizedStatementActions {
    private WebDriver driver;

    CustomizedStatementElements customizedStatementElements;

    public CustomizedStatementActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.customizedStatementElements = new CustomizedStatementElements(driver);

    }
    public void accountNo(String accountNo){
        customizedStatementElements.accountNo.sendKeys(accountNo);
    }
    public void fromDate(String fromDate){
        customizedStatementElements.fromDate.sendKeys(fromDate);
    }
    public void toDate(String toDate){
        customizedStatementElements.toDate.sendKeys(toDate);
    }
    public void lowerLimit(String lowerLimit){
        customizedStatementElements.lowerLimit.sendKeys(lowerLimit);
    }
    public void numberOfTransaction(String numberOfTransaction){
        customizedStatementElements.numberOFTransaction.sendKeys(numberOfTransaction);
    }
    public  void clickOnButton(String submit){
        customizedStatementElements.submit.click();
    }
}
