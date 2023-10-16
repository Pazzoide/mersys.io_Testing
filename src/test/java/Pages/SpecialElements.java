package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SpecialElements extends Parent {
    public SpecialElements() {
        PageFactory.initElements(Singleton_Driver.getDriver(), this);
    }

    @FindBy(xpath = "*********************************")
    public WebElement searchInput;

    @FindBy(xpath = "*********************************")
    public WebElement searchButton;
    @FindBy(xpath = "*********************************")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "*********************************")
    public WebElement deleteDialogBtn;

    public void deleteItem(String searchText) {
        inputElement(searchInput, searchText);
        elementToClick(searchButton);
        conditionWait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        elementToClick(deleteImageBtn);
        elementToClick(deleteDialogBtn);
    }
}
