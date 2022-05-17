package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResSingleResourceTest {

    @Test
    public void getSingleResourceTest(){
        given()
                .when()
                .get("https://reqres.in/api/unknown")
                .then()
                .statusCode(200);
    }

}
