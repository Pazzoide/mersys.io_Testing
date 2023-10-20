package StepDefinitions;

import Pages.Dialog_Elements;
import Pages.Left_Elements;
import Utilities.Singleton_Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test_Steps {
    Left_Elements le = new Left_Elements();
    Dialog_Elements de = new Dialog_Elements();

    @Given("Navigate to ParaBank website")
    public void navigateToParaBank() {
        Singleton_Driver.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        de.inputElement(de.username, "***********");
        de.inputElement(de.password, "************");
        de.elementToClick(de.loginButton);

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        de.textVerifyResult(de.txtTechnoStudy, "Techno Study");
    }
    @When("The user clicks the element")
    public void theUserClicksTheElement(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = le.getWebElement(elementLinks.get(i));
            le.elementToClick(clickedElements);
        }
    }
    @When("The user clicks the element by JavaScript")
    public void theUserClicksTheElementByJavaScript(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = le.getWebElement(elementLinks.get(i));
            le.clickByJavaScript(clickedElements);
        }
    }
    @Then("The user enters the required data")
    public void theUserEntersTheRequiredData(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement sendKeysElements = le.getWebElement(elementLinks.get(i).get(0));
            le.inputElement(sendKeysElements, elementLinks.get(i).get(1));
        }
    }
    @Then("The user verifies the message")
    public void theUserVerifiesTheMessage(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement verifyElements = le.getWebElement(elementLinks.get(i).get(0));
            le.textVerifyResult(verifyElements, elementLinks.get(i).get(1));
        }
    }
    @And("The user selects the element")
    public void theUserSelectsTheElement(DataTable tableData){
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement selectElement = le.getWebElement(elementLinks.get(i).get(0));
            le.dropdownHandler(selectElement,elementLinks.get(i).get(1));
        }
    }
}
