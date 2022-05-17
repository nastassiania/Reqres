package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqResDeleteTest {

    @Test
    public void deleteInfoTest(){
        given()
                .when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204);
    }

}
