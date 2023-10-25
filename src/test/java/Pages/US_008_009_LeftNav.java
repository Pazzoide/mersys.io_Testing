package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_008_009_LeftNav extends Parent {
    public US_008_009_LeftNav() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(text(),'School Setup')]")
    public WebElement schoolSetupButton;
    @FindBy(xpath = "//*[contains(text(),'Departments')]")
    public WebElement depatmentsButton;

    @FindBy(xpath = "(//span[contains(text(),'Bank Accounts')]) [1]")
    public WebElement bankAccounts;


    public WebElement getWebElement(String target) {
        switch (target) {

            case "schoolSetupButton": return this.schoolSetupButton;
            case "depatmentsButton": return this.depatmentsButton;
            case "bankAccounts": return this.bankAccounts;
        }
        return null;
    }


}