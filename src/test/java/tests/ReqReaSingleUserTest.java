package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqReaSingleUserTest {

    @Test
    public void getSingleUserInfoTest(){
        given()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .log().all()
                .statusCode(200);
    }
}
