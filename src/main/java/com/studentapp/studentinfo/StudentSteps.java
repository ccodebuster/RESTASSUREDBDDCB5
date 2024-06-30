package com.studentapp.studentinfo;

import com.studentapp.constants.EndPoints;
import com.studentapp.model.StudentPojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.List;

/**
 * Created by bhavesh
 */

public class StudentSteps {

    @Step("creating student with firstName :{0},lastName: {1},email:{2},programme:{3} and courses:{4}")
    public ValidatableResponse createStudent(String firstName, String lastName, String email, String programme, List<String>courseList){


    }

    @Step ("getting student info by firstName:{0}")
    public HashMap<String, Object> getStudentInfoByFirstName(String firstName){


    }



    @Step("update student infor with studentID:{0},firstName :{1},lastName: {2},email:{3},programme:{4} and courses:{5}")
    public ValidatableResponse updateStudent(int studentId,String firstName, String lastName, String email, String programme, List<String>courseList){

    }

    @Step("deleteing student information with studentId:{0}")
    public ValidatableResponse deleteStudentInfoByID(int studentId){

    }

    @Step("getting student info By studentId:{0}")
    public ValidatableResponse getStudentInfoByStudentId(int studentId){

    }

    @Step("getting all information :{0}")
    public ValidatableResponse getAllStudentInfo(){

    }



    @Step("getting student info by email:{0}")
    public HashMap<String,Object>getStudentInfoByEmail(String email){

    }
}
