package Pages;

import Utilities.Singleton_Driver;
import org.openqa.selenium.support.PageFactory;

public class CommonElements extends Parent{
    public CommonElements() {
        PageFactory.initElements(Singleton_Driver.getDriver(),this);
    }
}
