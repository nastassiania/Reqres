package tests;

import objects.reqres.Login;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResLoginUnsuccessfulTest {

    @Test
    public void loginUnsuccessfullyTest(){
        Login login = Login.builder().email("peter@klaven").build();
        given()
                .when()
                .body(login)
                .post("https://reqres.in/api/login")
                .then()
                .log().all()
                .statusCode(400);
    }

}
