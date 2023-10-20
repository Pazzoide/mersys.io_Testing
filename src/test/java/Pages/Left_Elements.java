package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Left_Elements extends Parent{
    public Left_Elements() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }
    //US-001 **********************************************
    @FindBy(xpath="(//span[text()='Human Resources'])[1]")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanSetup;
    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement humanPositionCategories;

    //US-002 **********************************************
    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement humanAttestations;

    //US-003 **********************************************
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;

    //US-004 **********************************************
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement humanPosition;
    public WebElement getWebElement(String target){
        switch (target){
            case "setup":
                return this.setup;
        }
        return null;
    }
}
