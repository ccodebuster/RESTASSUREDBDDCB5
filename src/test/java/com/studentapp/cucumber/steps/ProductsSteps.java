package com.studentapp.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;


public class ProductsSteps {
    static ValidatableResponse response;

    @When("^user send GET request to list$")
    public void userSendGETRequestToList() {


    }

    @Then("^user get valid repsonse$")
    public void userGetValidRepsonse() {
        response.statusCode(200);
    }
}
