package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResListResourceTest {
    @Test
    public void getListResourceTest(){
        given()
                .when()
                .get("https://reqres.in/api/unknown")
                .then()
                .log().all()
                .statusCode(200);
    }
}
