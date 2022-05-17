package tests;

import objects.reqres.User;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResUpdatePatchTest {

    @Test
    public void updatePatchClientInfoTest() {
        User user = User.builder().name("morpheus").job("zion resident").build();
        given()
                .body(user)
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .log().all()
                .statusCode(200);
    }

}
