package org.naic.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestTest {

    private static RequestSpecification requestSpec;

    @BeforeMethod
    public static void createSpecification(){
        requestSpec = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io").build();
    }

    @Test
    public void findByStatus(){

        given().
                spec(requestSpec)
                .when().
                get("/pet/findByStatus").
                then().
                assertThat().
                statusCode(200);
    }
}
