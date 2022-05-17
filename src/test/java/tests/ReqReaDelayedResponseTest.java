package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqReaDelayedResponseTest {

    @Test
    public void delayResponseTest(){
        given()
                .when()
                .get("https://reqres.in/api/users?delay=3")
                .then()
                .statusCode(200);
    }

}
