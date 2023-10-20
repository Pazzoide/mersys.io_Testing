package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dialog_Elements {
    public Dialog_Elements() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);

    }
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
}
