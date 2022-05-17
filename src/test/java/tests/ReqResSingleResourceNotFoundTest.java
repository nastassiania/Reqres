package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResSingleResourceNotFoundTest {

    @Test
    public void getSingleResourceNotFoundTest(){
        given()
                .when()
                .get("https://reqres.in/api/unknown/23")
                .then()
                .statusCode(404);
    }

}
