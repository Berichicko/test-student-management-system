package net.javaguides.ui.pages;

import net.javaguides.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    protected BasePage() {
        driver = DriverSingleton.getDriver();
    }
}
