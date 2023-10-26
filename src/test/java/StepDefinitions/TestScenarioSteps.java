package StepDefinitions;

import Pages.ModalMenuLocators;
import Pages.SidebarLocators;
import Utilities.Singleton_Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestScenarioSteps {
    ModalMenuLocators ml = new ModalMenuLocators();
    SidebarLocators sl = new SidebarLocators();

    @Given("The user navigate to website")
    public void theUserNavigateToWebsite() {
        Singleton_Driver.getDriver().get("https://test.mersys.io/");
    }

    @When("The user sending the keys in the ModalMenuLocators")
    public void theUserEntersTheDataIntoTheRelevantSection(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement sendKeysElements = ml.getWebElement(elementLinks.get(i).get(0));
            ml.inputElement(sendKeysElements, elementLinks.get(i).get(1));
        }
    }

    @Then("The user click on the element in ModalMenuLocators")
    public void theUserClicksOnTheRelevantElement(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = ml.getWebElement(elementLinks.get(i));
            ml.elementToClick(clickedElements);
        }
    }

    @And("The message should be displayed")
    public void theUserConfirmsTheConfirmationMessage(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement verifyElements = ml.getWebElement(elementLinks.get(i).get(0));
            ml.textVerifyResult(verifyElements, elementLinks.get(i).get(1));
        }
    }

    @When("The user click on the element in SidebarLocators")
    public void theUserClickOnTheElementInSidebarLocators(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = sl.getWebElement(elementLinks.get(i));
            sl.elementToClick(clickedElements);
        }
    }

    @When("The user delete on the item in ModalMenuLocators")
    public void theUserDeleteOnTheItemInModalMenuLocators(DataTable tableData) {
        List<String> itemsToRemove = tableData.asList(String.class);
        for (int i = 0; i < itemsToRemove.size(); i++) {
            ml.deleteItem(itemsToRemove.get(i));
        }
    }

    @Then("The user adds data named {string} to the relevant section")
    public void theUserAddsDataNamedToTheRelevantSection(String name) {
        ml.addItem(name);
    }

    @When("The user replaces the data named {string} with the data named {string} in the relevant section")
    public void theUserReplacesTheDataNamedWithTheDataNamedInTheRelevantSection(String name, String newName) {
        ml.editItem(name, newName);
    }

    @And("The user deletes the data named {string} in the relevant section")
    public void theUserDeletesTheDataNamedInTheRelevantSection(String newname) {
        ml.deleteItem(newname);
    }
}
