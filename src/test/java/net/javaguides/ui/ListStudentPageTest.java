package net.javaguides.ui;

import net.javaguides.ui.pages.ListStudentsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListStudentPageTest extends BaseTest {
    ListStudentsPage student;

    @BeforeMethod
    public void openStudentsPage() {
        student = new ListStudentsPage();
        student.openPage();
    }

    @Test
    public void testTitle() {
        student = new ListStudentsPage();
        Assert.assertEquals("Student Management System", student.getTitleStudentPage());
    }

    @Test
    public void testTitleTableStudent() {
        student = new ListStudentsPage();
        Assert.assertEquals("List Students", student.getTitleStudentTableStudentPage());
    }

    @Test
    public void testNameTableStudent() {
        student = new ListStudentsPage();
        Assert.assertEquals("Student First Name", student.getFirstNameStudentColumnTable());
    }

    @Test
    public void testLastNameTableStudent() {
        student = new ListStudentsPage();
        Assert.assertEquals("Student Last Name", student.getLastNameStudentColumnTable());
    }

    @Test
    public void testEmailTableStudent() {
        student = new ListStudentsPage();
        Assert.assertEquals("Student Email", student.getEmailStudentColumnTable());
    }

    @Test
    public void testActionsTableStudent() {
        student = new ListStudentsPage();
        Assert.assertEquals("Actions", student.getActionStudentColumnTable());
    }

    @Test
    public void testIsDisplayedLineInfoColumnTable() {
        student = new ListStudentsPage();
        Assert.assertTrue(student.isDisplayedLineInfoColumnTable());
    }

    @Test
    public void testIsDisplayedButtonUpdate() {
        student = new ListStudentsPage();
        Assert.assertTrue(student.isDisplayedButtonUpdate());
    }

    @Test
    public void testIsDisplayedButtonDelete() {
        student = new ListStudentsPage();
        Assert.assertTrue(student.isDisplayedButtonDelete());
    }
}
