package tests;

import objects.reqres.Login;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResLoginSuccessfulTest {

    @Test
    public void loginSuccessfullyTest(){
        Login login = Login.builder().email("eve.holt@reqres.in").password("cityslicka").build();
        given()
                .when()
                .header("Content-Type", "application/json")
                .body(login)
                .post("https://reqres.in/api/login")
                .then()
                .log().all()
                .statusCode(200);
    }

}
