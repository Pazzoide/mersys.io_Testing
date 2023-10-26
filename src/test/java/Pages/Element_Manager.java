package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Element_Manager extends Parent {
    public Element_Manager() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[@class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    private WebElement saveButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "(//div[@class='ng-star-inserted']//button)[2]")
    private WebElement deleteOkeyButton;
    @FindBy(xpath = "//div[@fxlayoutalign='center center']//button")
    private WebElement searchButton;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement dialogCloseButton;
    @FindBy(xpath = "*********************************")
    public WebElement searchInput;
    @FindBy(xpath = "*********************************")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "*********************************")
    public WebElement deleteDialogBtn;

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
        elementToClick(deleteImageBtn);
        elementToClick(deleteDialogBtn);
    }
}
