package tests;

import objects.reqres.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResCreateTest {

    @Test
    public void postCreateUserTest() {
        User user = User.builder()
                .name("morpheus")
                .job("Leader")
                .build();
       int actualId = Integer.valueOf(
        given()
                .body(user)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .extract().response().path("id"));
        Assert.assertTrue(actualId>0);
    }
}
