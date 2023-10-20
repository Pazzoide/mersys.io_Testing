package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dialog_Elements extends Parent{
    public Dialog_Elements() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);

    }
    //Login ******************************************************
    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[@class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement dialogCloseButton;
    @FindBy(xpath = "(//div[@class='ng-star-inserted']//button)[2]")
    public WebElement deleteOkeyButton;

    //*************************************************************
    @FindBy(css = "ms-add-button[class='ng-star-inserted']")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'NAME')]//input")
    private WebElement searchInput;
    @FindBy(xpath = "//div[@fxlayoutalign='center center']//button")
    private WebElement searchButton;
    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    private WebElement editButton;
    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteIcon;
    @FindBy(xpath = "//button/span[contains(text(),'Delete')]")
    private WebElement deleteButton;

    //US-003 ***************************************************
    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stage;
    @FindBy(xpath="//span[text()=' Student Registration ']") //tıklama sonrası ESC tıklanması gerekli
    private WebElement studentReg;
    @FindBy(xpath = "//*[contains(text(),'Description')]")
    private WebElement description;
    public WebElement getWebElement(String target) {
        switch (target) {

            case "addButton":
                return this.addButton;
            case "deleteButton":
                return this.deleteButton;
            case "loginButton":
                return this.loginButton;
            case "searchButton":
                return this.searchButton;
            case "deleteOkeyButton":
                return this.deleteOkeyButton;
            case "dialogCloseButton":
                return this.dialogCloseButton;
            case "saveButton":
                return this.saveButton;
            case "nameInput":
                return this.nameInput;
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "txtTechnoStudy":
                return this.txtTechnoStudy;
        }
        return null;
    }
    public void deleteItem(String searchText) {
        inputElement(searchInput, searchText);
        elementToClick(searchButton);
        conditionWait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        elementToClick(deleteIcon);
        elementToClick(deleteButton);
    }
}
