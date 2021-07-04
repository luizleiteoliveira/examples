package com.luizleiteoliveira;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }


    @Test
    public void testByeEndpoint() {
        given()
            .when().get("/hello/bye")
            .then()
                .statusCode(200)
                .body(is("Bye app"));
    }

}