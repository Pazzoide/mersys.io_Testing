package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;

public class Singleton_Driver {
    final private static ThreadLocal<WebDriver> tlWebDriver = new ThreadLocal<>();
    public static ThreadLocal<String> tlText = new ThreadLocal<>();

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        if (tlText.get() == null) {
            tlText.set("chrome");
        }
        if (tlWebDriver.get() == null) {
            switch (tlText.get()) {
                case "edge":
                    tlWebDriver.set(new EdgeDriver());
                    break;
                case "safari":
                    tlWebDriver.set(new SafariDriver());
                    break;
                case "firefox":
                    tlWebDriver.set(new FirefoxDriver());
                    break;
                default:
                    tlWebDriver.set(new ChromeDriver());
            }
        }
        tlWebDriver.get().manage().window().maximize();
        tlWebDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        return tlWebDriver.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException Ex) {
            throw new RuntimeException(Ex);
        }
        if (tlWebDriver.get() == null) {
            tlWebDriver.get().quit();
            WebDriver driver = tlWebDriver.get();
            driver = null;
            tlWebDriver.set(driver);
        }
    }
}
