package net.javaguides.ui.pages;

import net.javaguides.ui.utils.RandomValueStudent;
import org.openqa.selenium.By;

public class CreateNewStudentPage extends BasePage {
    public static final By TITLE_NAME_FORM_ADD_STUDENT_LOCATOR = By.xpath("//h1[contains(text(),'Create New Student')]");
    public static final By LABEL_FIRST_NAME_STUDENT_FORM_ADD_STUDENT_LOCATOR = By.xpath("//label[text()=' Student First Name ']");
    public static final By LABEL_LAST_NAME_STUDENT_FORM_ADD_STUDENT_LOCATOR = By.xpath("//label[text()=' Student Last Name ']");
    public static final By LABEL_EMAIL_NAME_STUDENT_FORM_ADD_STUDENT_LOCATOR = By.xpath("//label[text()=' Student Email ']");
    public static final By BUTTON_SUBMIT_LOCATOR = By.xpath("//button[@type='submit']");
    public static final By INPUT_FIRST_NAME_LOCATOR = By.id("firstName");
    public static final By INPUT_LAST_NAME_LOCATOR = By.id("lastName");
    public static final By INPUT_EMAIL_LOCATOR = By.id("email");

    public UpdateStudentPage inputFirstNameStudent() {
        driver.findElement(INPUT_FIRST_NAME_LOCATOR).sendKeys(RandomValueStudent.STUDENT_NAME);
        return new UpdateStudentPage();
    }

    public UpdateStudentPage inputLastNameStudent() {
        driver.findElement(INPUT_LAST_NAME_LOCATOR).sendKeys(RandomValueStudent.STUDENT_LAST_NAME);
        return new UpdateStudentPage();
    }

    public UpdateStudentPage inputEmailStudent() {
        driver.findElement(INPUT_EMAIL_LOCATOR).sendKeys(RandomValueStudent.STUDENT_EMAIL);
        return new UpdateStudentPage();
    }

    public UpdateStudentPage clickButtonSubmitForm() {
        driver.findElement(BUTTON_SUBMIT_LOCATOR).click();
        return new UpdateStudentPage();
    }

    public String getTitleNameFormCreateStudentPage() {
        return driver.findElement(TITLE_NAME_FORM_ADD_STUDENT_LOCATOR).getText();
    }

    public String getLabelFirstNameFormCreateStudentPage() {
        return driver.findElement(LABEL_FIRST_NAME_STUDENT_FORM_ADD_STUDENT_LOCATOR).getText();
    }

    public String getLabelLastNameFormCreateStudentPage() {
        return driver.findElement(LABEL_LAST_NAME_STUDENT_FORM_ADD_STUDENT_LOCATOR).getText();
    }

    public String getLabelEmailFormCreateStudentPage() {
        return driver.findElement(LABEL_EMAIL_NAME_STUDENT_FORM_ADD_STUDENT_LOCATOR).getText();
    }

    public boolean isDisplayedButtonSubmit() {
        return driver.findElement(BUTTON_SUBMIT_LOCATOR).isDisplayed();
    }
}
