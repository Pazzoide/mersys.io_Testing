package StepDefinitions;

import Pages.Fatihhan_Elements;
import Pages.ModalMenuLocators;
import Pages.SidebarLocators;
import Utilities.Singleton_Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Fatihhan_Steps {

    Fatihhan_Elements ml = new Fatihhan_Elements();

    @And("Delayed click on edit button")
    public void delayedClickOnEditButton(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.conditionWait.until(ExpectedConditions.elementToBeClickable(
                    ml.getWebElement("searchButton")));
            ml.elementToClick(clickedElements);
        }
    }
    @And("Pressing ESC")
    public void pressToESC() {
        new Actions(Singleton_Driver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    @Then("Adding New Fields to the Admin Panel")
    public void addingNewFieldsToTheAdminPanel(DataTable tableData) throws InterruptedException {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);

            if (elementLinks.get(i).equals("listOfValueOption")) {
                ml.inputElement(ml.getWebElement("key"), "123");
                ml.inputElement(ml.getWebElement("value"), "321");
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            } else if (elementLinks.get(i).equals("compositeOption")) {
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
                ml.conditionWait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//ms-dialog//button[@color='warn'])")));
                ml.elementToClick(ml.getWebElement("childFieldsDeleteButton"));
                ml.elementToClick(ml.getWebElement("deleteButton"));
                ml.elementToClick(ml.getWebElement("childFieldSelect"));
                ml.elementToClick(ml.childFieldOption.get(0));
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            }
        }
    }

    @Then("Editing Fields to the Admin Panel")
    public void editingFieldsToTheAdminPanel(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);

            if (elementLinks.get(i).equals("listOfValueOption")) {
                ml.inputElement(ml.getWebElement("key"), "321");
                ml.inputElement(ml.getWebElement("value"), "123");
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            } else if (elementLinks.get(i).equals("compositeOption")) {
                ml.conditionWait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//ms-dialog//button[@color='warn'])")));
                ml.elementToClick(ml.getWebElement("childFieldsDeleteButton"));
                ml.elementToClick(ml.getWebElement("deleteButton"));
                ml.elementToClick(ml.getWebElement("childFieldSelect"));
                ml.elementToClick(ml.childFieldOption.get(1));
                ml.elementToClick(ml.getWebElement("compLovAddButton"));
            }
        }
    }

}
