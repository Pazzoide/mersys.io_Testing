package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Fatihhan_Elements extends Parent{
    public Fatihhan_Elements() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }

    //US-003 ***************************************************
    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stage;
    @FindBy(xpath="//span[text()=' Student Registration ']") //tıklama sonrası ESC tıklanması gerekli
    private WebElement studentReg;
    @FindBy(xpath = "//span[text()=' Examination ']")
    private WebElement examination;
    @FindBy(xpath = "//span[text()=' Employment ']")
    private WebElement employment;
    @FindBy(xpath = "//span[text()=' Certificate ']")
    private WebElement certificate;
    @FindBy(xpath = "//span[text()=' Contract ']")
    private WebElement contract;
    @FindBy(xpath = "//span[text()=' Dismissal ']")
    private WebElement dismissal;
    @FindBy(xpath = "//*[contains(text(),'Description')]")
    private WebElement description;
    //US-004 ***************************************************
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement fieldTypesOptions;
    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    private WebElement numberOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement textOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[3]")
    private WebElement integerOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[4]")
    private WebElement listOfValueOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[5]")
    private WebElement dateOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[6]")
    private WebElement logicalOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[7]")
    private WebElement memoFieldOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[8]")
    private WebElement compositeOption;
    @FindBy(css = "input[data-placeholder='Key']")
    private WebElement key;
    @FindBy(css = "input[data-placeholder='Value']")
    private WebElement value;
    @FindBy(css = "ms-button[icon='plus']>button")
    private WebElement compLovAddButton;
    @FindBy(xpath = "((//mat-select[@role='combobox'])[3]//div)[3]")
    private WebElement childFieldSelect;
    @FindBy(xpath = "//mat-option[@role='option']")
    public List<WebElement> childFieldOption;
    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    private WebElement childFieldOption2;
    @FindBy(xpath = "(//ms-dialog//button[@color='warn'])")
    private WebElement childFieldsDeleteButton;

    public WebElement getWebElement(String target) {
        switch (target) {

            case "stage": return this.stage;
            case "studentReg": return this.studentReg;
            case "examination": return this.examination;
            case "employment": return this.employment;
            case "certificate": return this.certificate;
            case "contract": return this.contract;
            case "dismissal": return this.dismissal;
            case "description": return this.description;
            case "codeInput": return this.codeInput;
            case "fieldTypesOptions": return this.fieldTypesOptions;
            case "numberOption": return this.numberOption;
            case "textOption": return this.textOption;
            case "integerOption": return this.integerOption;
            case "listOfValueOption": return this.listOfValueOption;
            case "dateOption": return this.dateOption;
            case "logicalOption": return this.logicalOption;
            case "memoFieldOption": return this.memoFieldOption;
            case "compositeOption": return this.compositeOption;
            case "key": return this.key;
            case "value": return this.value;
            case "compLovAddButton": return this.compLovAddButton;
            case "childFieldSelect": return this.childFieldSelect;
            case "childFieldsDeleteButton": return this.childFieldsDeleteButton;

        }
        return null;
    }

}
