package com.herokuapp.restful_booker.restfulbookerinfo;

import com.herokuapp.restful_booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class RestfulGetTest extends TestBase {

        @Test
        public void getAllBookingInfo() {
            Response response = given()
                    .when()
                    .get();
            response.then().statusCode(200);
            response.prettyPrint();
        }

        @Test
        public void getSingleBookingInfo() {
            Response response = given()
                    .pathParam("id",2456)
                    .when()
                    .get("/{id}");
            response.then().statusCode(200);
            response.prettyPrint();
        }



}
