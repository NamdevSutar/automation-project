package pageActions;

import org.openqa.selenium.WebDriver;
import pageElements.MiniStatementElements;
import stepDefinitions.CommonSteps;

import javax.lang.model.util.Elements;

public class MiniStatementActions {
    private WebDriver driver;
    MiniStatementElements miniStatementElements;

    public MiniStatementActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.miniStatementElements = new MiniStatementElements(driver);
    }

    public void accountNo(String accountNo) {
        miniStatementElements.accountNo.sendKeys(accountNo);
    }

    public void clickOnButton(String submit) {
        miniStatementElements.submit.click();
    }
}