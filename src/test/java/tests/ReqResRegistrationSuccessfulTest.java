package tests;

import objects.reqres.Registration;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResRegistrationSuccessfulTest {

    @Test
    public void registerUserSuccessfullyTest(){
        Registration registration = Registration.builder().email("eve.holt@reqres.in").password("pistol").build();
        given()
                .when()
                .header("Content-Type", "application/json")
                .body(registration)
                .log().all()
                .post("https://reqres.in/api/register")
                .then()
                .log().all()
                .statusCode(200);
    }


}
