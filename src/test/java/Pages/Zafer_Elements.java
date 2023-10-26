package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zafer_Elements extends Parent{
    public Zafer_Elements() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(linkText = "Human Resources")
    public WebElement humanResourcesBtn;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupBtn;
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positionsBtn;
    @FindBy(xpath = "//ms-add-button//div")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameBox;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortNameBox;
    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveBtn;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//ms-text-field//input[@data-placeholder='Name']")
    public WebElement searchName;
    @FindBy(xpath = "//div[@fxlayoutalign='center center']//button")
    private WebElement searchButton;
    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    private WebElement editButton;
    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteIcon;
    @FindBy(xpath = "//button/span[contains(text(),'Delete')]")
    private WebElement deleteButton;
    @FindBy(linkText = "Education")
    public WebElement educationButton;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupButton;
    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    public WebElement subjectCategoriesBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement code;



    public WebElement getWebElement(String strElement) {
        switch (strElement){
            case "username": return this.username;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "humanResourcesBtn": return this.humanResourcesBtn;
            case "setupBtn": return this.setupBtn;
            case "positionsBtn": return this.positionsBtn;
            case "addButton": return this.addButton;
            case "nameBox": return this.nameBox;
            case "shortNameBox": return this.shortNameBox;
            case "saveBtn": return this.saveBtn;
            case "successMessage": return this.successMessage;
            case "searchName": return this.searchName;
            case "searchButton": return this.searchButton;
            case "editButton": return this.editButton;
            case "deleteIcon": return this.deleteIcon;
            case "deleteButton": return this.deleteButton;
            case "educationButton": return this.educationButton;
            case "setupButton": return this.setupButton;
            case "subjectCategoriesBtn": return this.subjectCategoriesBtn;
            case "code": return this.code;
        }
        return null;
    }

}
