package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResSingleUserNotFoundTest {

    @Test
    public void getSingleUserNotFoundTest(){
        given()
                .when()
                .get("https://reqres.in/api/users/23")
                .then()
                .log().all()
                .statusCode(404);
    }

}
