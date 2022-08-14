package net.javaguides.ui;

import net.javaguides.ui.driver.DriverSingleton;
import org.testng.annotations.AfterClass;

public class BaseTest {

    @AfterClass(alwaysRun = true)
    public void closeDriver() {
        DriverSingleton.closeDriver();
    }
}
