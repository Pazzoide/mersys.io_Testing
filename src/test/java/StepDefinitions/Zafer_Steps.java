package StepDefinitions;

import Pages.Zafer_Elements;
import Utilities.Singleton_Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Zafer_Steps {

    Zafer_Elements xx = new Zafer_Elements();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        Singleton_Driver.getDriver().get("https://test.mersys.io/");
    }

    @When("User sending the keys")
    public void userSendingTheKeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = xx.getWebElement(items.get(i).get(0));
            xx.inputElement(e, items.get(i).get(1));
        }
    }


    @Then("Click on the element")
    public void clickOnTheElement05(DataTable dt) {
        List<String> strClickItems = dt.asList(String.class);
        for (int i = 0; i < strClickItems.size(); i++) {
            WebElement e = xx.getWebElement(strClickItems.get(i));
            xx.elementToClick(e);
        }
    }
    @And("Text verification process")
    public void textVerificationProcess05(DataTable dt) {
        List<List<String>> text = dt.asLists(String.class);
        for (int i = 0; i < text.size(); i++) {
            WebElement e = xx.getWebElement(text.get(i).get(0));
            xx.textVerifyResult(e, text.get(i).get(1));
        }
    }
}
