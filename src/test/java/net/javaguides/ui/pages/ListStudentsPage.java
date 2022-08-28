package net.javaguides.ui.pages;

import net.javaguides.ui.utils.Constants;
import org.openqa.selenium.By;

public class ListStudentsPage extends BasePage {
    public static final By BUTTON_ADD_STUDENT_LOCATOR = By.xpath("//a[@class='btn btn-primary btn-sm mb-3']");
    public static final By TITLE_TABLE_STUDENTS_LOCATOR = By.xpath("//div[@class='row']/h1 ");
    public static final By FIRST_NAME_STUDENT_COLUMN_TABLE_LOCATOR = By.xpath("//th[contains(text(), 'Student First Name')]");
    public static final By LAST_NAME_STUDENT_COLUMN_TABLE_LOCATOR = By.xpath("//th[contains(text(), ' Student Last Name')]");
    public static final By EMAIL_STUDENT_TABLE_COLUMN_LOCATOR = By.xpath(" //th[contains(text(), ' Student Email ')]");
    public static final By ACTION_STUDENT_TABLE_COLUMN_LOCATOR = By.xpath(" //th[contains(text(), ' Actions ')]");
    public static final By LINE_INFO_STUDENT_TABLE_LOCATOR = By.xpath("//tbody/tr[1]");
    public static final By UPDATE_BUTTON_TABLE_LOCATOR = By.xpath("//a[@class='btn btn-primary']");
    public static final By DELETE_BUTTON_TABLE_LOCATOR = By.xpath("//a[@class='btn btn-danger']");

    public ListStudentsPage openPage() {
        driver.get(Constants.BASE_URL);
        return this;
    }

    public CreateNewStudentPage clickButtonCreateStudent() {
        driver.findElement((BUTTON_ADD_STUDENT_LOCATOR)).click();
        return new CreateNewStudentPage();
    }

    public ListStudentsPage deleteAllStudents() {
        try {
            while (driver.findElement(LINE_INFO_STUDENT_TABLE_LOCATOR).isDisplayed()) {
                driver.findElement(DELETE_BUTTON_TABLE_LOCATOR).click();
            }
        } catch (Exception e) {
        }
        return this;
    }

    public String getTitleStudentPage() {
        return driver.getTitle();
    }

    public String getTitleStudentTableStudentPage() {
        return driver.findElement(TITLE_TABLE_STUDENTS_LOCATOR).getText();
    }

    public String getFirstNameStudentColumnTable() {
        return driver.findElement(FIRST_NAME_STUDENT_COLUMN_TABLE_LOCATOR).getText();
    }

    public String getLastNameStudentColumnTable() {
        return driver.findElement(LAST_NAME_STUDENT_COLUMN_TABLE_LOCATOR).getText();
    }

    public String getEmailStudentColumnTable() {
        return driver.findElement(EMAIL_STUDENT_TABLE_COLUMN_LOCATOR).getText();
    }

    public String getActionStudentColumnTable() {
        return driver.findElement(ACTION_STUDENT_TABLE_COLUMN_LOCATOR).getText();
    }

    public boolean isDisplayedLineInfoColumnTable() {
        return driver.findElement(LINE_INFO_STUDENT_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedButtonUpdate() {
        return driver.findElement(UPDATE_BUTTON_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedButtonDelete() {
        return driver.findElement(DELETE_BUTTON_TABLE_LOCATOR).isDisplayed();
    }
}
