package tests;

import objects.reqres.User;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResUpdatePutTest {

    @Test
    public void updatePutClientInfoTest(){
        User user = User.builder()
                .name("morpheus")
                .job("zion resident")
                .build();
        given()
                .body(user)
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .log().all()
                .statusCode(200);
    }

}
