package net.javaguides.api;

import net.javaguides.api.service.StudentService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiStudentTest {
    StudentService studentService;

    @Test
    public void postResponseCodeCreateNewStudent() {
        studentService = new StudentService();
        Assert.assertEquals(302, studentService.postAddNewStudent());
    }

    @Test
    public void getResponseCodeStudents() {
        studentService = new StudentService();
        Assert.assertEquals(200, studentService.getStudents());

    }

    @Test
    public void getResponseCodeDeleteStudent() {
        studentService = new StudentService();
        Assert.assertEquals(200, studentService.deleteStudent());

    }

    @Test
    public void getResponseCodeUptadeStudent() {
        studentService = new StudentService();
        Assert.assertEquals(302, studentService.updateStudent());

    }
}
