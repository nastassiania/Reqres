package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResListUsersTest {

    @Test
    public  void getListOfUsersTest(){
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .log().all()
                .statusCode(200);
    }

}
