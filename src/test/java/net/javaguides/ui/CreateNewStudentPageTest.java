package net.javaguides.ui;
import net.javaguides.ui.pages.CreateNewStudentPage;
import net.javaguides.ui.pages.ListStudentsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewStudentPageTest extends BaseTest {
    CreateNewStudentPage createNewStudentPage;

    @BeforeMethod
    public void openCreateNewStudentPage() {
        createNewStudentPage = new ListStudentsPage()
                .openPage()
                .clickButtonCreateStudent();
    }

    @Test
    public void testTitleNameFormCreateStudentPage() {
        createNewStudentPage = new CreateNewStudentPage();
        Assert.assertEquals("Create New Student", createNewStudentPage.getTitleNameFormCreateStudentPage());
    }

    @Test
    public void testLabelFirstNameFormCreateStudentPage() {
        createNewStudentPage = new CreateNewStudentPage();
        Assert.assertEquals("Student First Name", createNewStudentPage.getLabelFirstNameFormCreateStudentPage());
    }

    @Test
    public void testLabelLastNameFormCreateStudentPage() {
        createNewStudentPage = new CreateNewStudentPage();
        Assert.assertEquals("Student Last Name", createNewStudentPage.getLabelLastNameFormCreateStudentPage());
    }

    @Test
    public void testLabelEmailFormCreateStudentPage() {
        createNewStudentPage = new CreateNewStudentPage();
        Assert.assertEquals("Student Email", createNewStudentPage.getLabelEmailFormCreateStudentPage());
    }

    @Test
    public void testIsDisplayedButtonSubmit() {
        createNewStudentPage = new CreateNewStudentPage();
        Assert.assertTrue(createNewStudentPage.isDisplayedButtonSubmit());
    }
}
