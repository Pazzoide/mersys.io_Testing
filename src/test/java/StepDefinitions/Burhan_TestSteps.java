package StepDefinitions;

import Pages.ModalMenuLocators;
import Pages.SidebarLocators;
import Utilities.ExcelManager;
import Utilities.Singleton_Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Burhan_TestSteps {
    ModalMenuLocators ml = new ModalMenuLocators();
    SidebarLocators sl = new SidebarLocators();
    @Given("The user navigate to website")
    public void theUserNavigateToWebsite() {
        Singleton_Driver.getDriver().get("https://test.mersys.io/");
    }

    @Given("The user logs in with the data received from Excel")
    public void theUserNavigateToWebsiteAndLoginProcess(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            int columnCount = Integer.parseInt(elementLinks.get(i).get(1));
            ArrayList<ArrayList<String>> tablo = ExcelManager.getData("src/test/java/ExcelFiles/LoginInfo.xlsx",
                    elementLinks.get(i).get(0), columnCount);

            for (ArrayList<String> satir : tablo) {
                ml.inputElement(ml.username, satir.get(0));
                ml.inputElement(ml.password, satir.get(1));
                ml.elementToClick(ml.loginButton);
                if (columnCount > 2) {
                    WebElement verifyElements = ml.getWebElement(satir.get(2));
                    ml.textVerifyResult(verifyElements, satir.get(3));
                }
            }
        }
    }
}
