package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_008_009_Dialog  {
    public US_008_009_Dialog() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted'])[1]")
    public WebElement editButton1;
    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    public WebElement ibanInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']/div/div/span")
    public WebElement currency;
    @FindBy(xpath = "//span[contains(text(),'TRY')]")
    public WebElement currencyList;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']/input")
    public WebElement integrationCode;

    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    private WebElement deleteIconButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement dialogdeleteButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'NAME')]//input")
    private WebElement searchInput;
    @FindBy(css = "ms-search-button")
    private WebElement searchButton;


    public WebElement getWebElement(String target) {
        switch (target) {



            case "deleteIconButton":
                return this.deleteIconButton;
            case "loginButton":

                return this.searchButton;
            case "dialogdeleteButton": return this.dialogdeleteButton;
            case "dialogCloseButton":
                        return this.codeInput;
            case "successMessage":
                return this.successMessage;
            case "editButton1":
                return this.editButton1;
            case "ibanInput":
                return this.ibanInput;
            case "currency":
                return this.currency;
            case "currencyList":
                return this.currencyList;
            case "integrationCode":
                return this.integrationCode;


        }
        return null;
    }


}
