package net.javaguides.ui;

import net.javaguides.ui.pages.CreateNewStudentPage;
import net.javaguides.ui.pages.ListStudentsPage;
import net.javaguides.ui.pages.UpdateStudentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateStudentPageTest extends BaseTest {
    UpdateStudentPage updateStudentPage;
    CreateNewStudentPage createNewStudentPage;

    @Test
    public void testIsDisplayedNewStudentTable() {

        createNewStudentPage = new ListStudentsPage()
                .openPage()
                .clickButtonCreateStudent()
                .inputFirstNameStudent()
                .inputLastNameStudent()
                .inputEmailStudent()
                .clickButtonSubmitForm();

        Assert.assertTrue(updateStudentPage.isDisplayedFirstNameNewStudentTable());
        Assert.assertTrue(updateStudentPage.isDisplayedLastNameNewStudentTable());
        Assert.assertTrue(updateStudentPage.isDisplayedEmailNewStudentTable());
        Assert.assertTrue(updateStudentPage.isDisplayedUptadeButton());
    }

    @Test
    public void testTitleNamePlaceholder() {

        createNewStudentPage = new ListStudentsPage()
                .openPage()
                .clickButtonCreateStudent()
                .inputFirstNameStudent()
                .inputLastNameStudent()
                .inputEmailStudent()
                .clickButtonSubmitForm();

        updateStudentPage = new UpdateStudentPage()
                .clickButtonUpdateStudent()
                .inputNewNameStudent()
                .inputNewLastNameStudent()
                .inputNewEmailStudent();

        Assert.assertEquals("Enter Student First Name", updateStudentPage.getTitleFirstNamePlaceholder());
        Assert.assertEquals("Enter Student Last Name", updateStudentPage.getTitleLastNamePlaceholder());
        Assert.assertEquals("Enter Student Email", updateStudentPage.getTitleEmailPlaceholder());
    }

    @Test
    public void testDeleteNewStudentPage() {

        createNewStudentPage = new ListStudentsPage()
                .openPage()
                .deleteAllStudents()
                .clickButtonCreateStudent()
                .inputFirstNameStudent()
                .inputLastNameStudent()
                .inputEmailStudent()
                .clickButtonSubmitForm();

        updateStudentPage = new UpdateStudentPage();
        updateStudentPage.clickButtonDeleteStudent();

        Assert.assertFalse(updateStudentPage.isDisplayedPresentFirstNameStudent());
        Assert.assertFalse(updateStudentPage.isDisplayedPresentLastNameStudent());
        Assert.assertFalse(updateStudentPage.isDisplayedPresentEmailStudent());
    }
}
