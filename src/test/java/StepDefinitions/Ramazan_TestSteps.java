package StepDefinitions;

import Pages.Dialog_Elements;
import Pages.Left_Elements;
import Utilities.Singleton_Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ramazan_TestSteps {

    Left_Elements le = new Left_Elements();
    Dialog_Elements de = new Dialog_Elements();

    LoginPom lg = new LoginPom(); //ramazan

    @Given("The user navigate to website")
    public void theUserNavigateToWebsite() {
        Singleton_Driver.getDriver().get("https://test.mersys.io/");
    }

    @Given("The user logs in with the data received from Excel")
    public void theUserNavigateToWebsiteAndLoginProcess(DataTable tableData) {

    }




    @When("The user clicks the elementDia")
    public void theUserClicksTheElementDia(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements1 = de.getWebElement(elementLinks.get(i));
            de.elementToClick(clickedElements1);
        }
    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog(DataTable dt) {
        List<String> deleteList = dt.asList(String.class);
        for (int i = 0; i < deleteList.size(); i++) {
            de.deleteItem(deleteList.get(i));
        }

    }
}