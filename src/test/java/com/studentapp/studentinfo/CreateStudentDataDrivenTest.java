package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhavesh
 */

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/java/resources/testdata/MOCK_DATA.csv")
public class CreateStudentDataDrivenTest extends TestBase {
//    private String firstName = "bhav";
//    private String lastName = "pat";
//    private String email = "2342xyz@gmail.com";
//    private String programme = "adding";
//    private String course1 = "plus";
//    private String course2 = "divide";

    private String firstName;
    private String lastName;
    private String email;
    private String programme ;
    private String course1;
    private String course2;

    @Steps
    StudentSteps studentSteps;

    @Title("Data driven test")
    @Test
    public void
    createMultipleTStudentData() {
        List<String> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        studentSteps.createStudent(firstName, lastName, email, programme, courses);
    }
}


