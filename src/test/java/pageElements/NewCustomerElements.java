package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerElements {
    WebDriver driver;

    @FindBy(name = "name")
    public WebElement customerName;


    @FindBy(name = "rad1")
     public WebElement gender;


    @FindBy(id = "dob")
    public WebElement dateOfBirth;

    @FindBy(name = "addr")
   public WebElement address;

    @FindBy(name = "city")
   public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "pinno")
    public WebElement pin;

    @FindBy(name = "telephoneno")
    public WebElement telephone;

    @FindBy(name = "emailid")
    public WebElement emailId;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;
    public NewCustomerElements(WebDriver driver) {
      this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnButton() {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void DateOfBirth(String dateOfBirth) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
