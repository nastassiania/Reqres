package tests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import objects.headhunter.VacanciesList;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HeadHunterTest {

@Test
    public void vacancyTest() {
    String body = given()
                .when()
                .get("https://api.hh.ru/vacancies?text=QA automation")
                .then()
//                .log().all()
                .statusCode(200)
                .extract().body().asString();

    VacanciesList vacanciesList = new Gson().fromJson(body, VacanciesList.class);
    int salaryTo = vacanciesList.getItems().get(0).getSalary().getTo();
    System.out.println(salaryTo);

    VacanciesList vacanciesListWithoutExpose = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().fromJson(body, VacanciesList.class);
    System.out.println(vacanciesListWithoutExpose);

    }

}
