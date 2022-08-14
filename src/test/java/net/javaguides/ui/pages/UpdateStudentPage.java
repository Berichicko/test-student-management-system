package net.javaguides.ui.pages;

import net.javaguides.ui.utils.RandomValueStudent;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class UpdateStudentPage extends CreateNewStudentPage {

    public static final By FIRST_NAME_NEW_STUDENT_TABLE_LOCATOR = By.xpath
            (StringUtils.deleteWhitespace("//td[contains(text()," + "'" +
                    RandomValueStudent.STUDENT_NAME + "'" + ")]"));
    public static final By LAST_NAME_NEW_STUDENT_TABLE_LOCATOR = By.xpath
            (StringUtils.deleteWhitespace("//td[contains(text()," + "'" +
                    RandomValueStudent.STUDENT_LAST_NAME + "'" + ")]"));
    public static final By EMAIL_NEW_STUDENT_TABLE_LOCATOR = By.xpath
            (StringUtils.deleteWhitespace("//td[contains(text()," + "'" +
                    RandomValueStudent.STUDENT_EMAIL + "'" + ")]"));
    public static final By UPDATE_BUTTON_NEW_STUDENT_TABLE_LOCATOR = By.xpath
            (StringUtils.deleteWhitespace("//td[contains(text()," + "'" +
                    RandomValueStudent.STUDENT_NAME + "'" + ")]//following::a[1]"));

    public static final By DELETE_BUTTON_NEW_STUDENT_LOCATOR = By.xpath(
            StringUtils.deleteWhitespace("//td[contains(text()," + "'" +
                    RandomValueStudent.STUDENT_NAME + "'" + ")]//following::a[2]"));

    public UpdateStudentPage clickButtonUpdateStudent() {
        driver.findElement((UPDATE_BUTTON_NEW_STUDENT_TABLE_LOCATOR)).click();
        return new UpdateStudentPage();
    }

    public UpdateStudentPage inputNewNameStudent() {
        driver.findElement(INPUT_FIRST_NAME_LOCATOR).clear();
        driver.findElement(INPUT_FIRST_NAME_LOCATOR).sendKeys(RandomValueStudent.STUDENT_NAME);
        return new UpdateStudentPage();
    }


    public UpdateStudentPage inputNewLastNameStudent() {
        driver.findElement(INPUT_LAST_NAME_LOCATOR).clear();
        driver.findElement(INPUT_LAST_NAME_LOCATOR).sendKeys(RandomValueStudent.STUDENT_LAST_NAME);
        return new UpdateStudentPage();
    }

    public UpdateStudentPage inputNewEmailStudent() {
        driver.findElement(INPUT_EMAIL_LOCATOR).clear();
        driver.findElement(INPUT_EMAIL_LOCATOR).sendKeys(RandomValueStudent.STUDENT_EMAIL);
        return new UpdateStudentPage();
    }

    public UpdateStudentPage clickButtonSubmitForm() {
        driver.findElement(BUTTON_SUBMIT_LOCATOR).click();
        return new UpdateStudentPage();
    }

    public boolean isDisplayedFirstNameNewStudentTable() {
        return driver.findElement(FIRST_NAME_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedLastNameNewStudentTable() {
        return driver.findElement(LAST_NAME_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedEmailNewStudentTable() {
        return driver.findElement(EMAIL_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedUptadeButton() {
        return driver.findElement(UPDATE_BUTTON_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
    }

    public String getTitleFirstNamePlaceholder() {
        return driver.findElement(INPUT_FIRST_NAME_LOCATOR).getAttribute("placeholder");
    }

    public String getTitleLastNamePlaceholder() {
        return driver.findElement(INPUT_LAST_NAME_LOCATOR).getAttribute("placeholder");
    }

    public String getTitleEmailPlaceholder() {
        return driver.findElement(INPUT_EMAIL_LOCATOR).getAttribute("placeholder");
    }

    public UpdateStudentPage clickButtonDeleteStudent() {
        driver.findElement(DELETE_BUTTON_NEW_STUDENT_LOCATOR).click();
        return new UpdateStudentPage();
    }

    public boolean isDisplayedPresentFirstNameStudent() {
        try {
            return driver.findElement(UpdateStudentPage.FIRST_NAME_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isDisplayedPresentLastNameStudent() {
        try {
            return driver.findElement(UpdateStudentPage.LAST_NAME_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isDisplayedPresentEmailStudent() {
        try {
            return driver.findElement(UpdateStudentPage.EMAIL_NEW_STUDENT_TABLE_LOCATOR).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
