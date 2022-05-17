package tests;

import objects.reqres.Registration;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResRegistrationUnsuccessfulTest {

    @Test
    public void registerUserUnuccessfullyTest(){
        Registration registration = Registration.builder().email("sydney@fife").build();
        given()
                .when()
                .body(registration)
                .post("https://reqres.in/api/register")
                .then()
                .log().all()
                .statusCode(400);
    }

}
