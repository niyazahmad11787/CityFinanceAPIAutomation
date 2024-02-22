package com.Cityfinance.api.ApplicationAPI;

import com.Cityfinance.POJO.Login;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.Cityfinance.api.Route.*;
import static com.Cityfinance.api.SpecBuilder.getRequestSpecification;
import static com.Cityfinance.api.SpecBuilder.getResponseSpecification;
import static io.restassured.RestAssured.given;

public class CityfinanceAPI {

public static Response post( HashMap<String,String> loginPayload){
    return given(getRequestSpecification())
            .body(loginPayload).
            when()
            .post(LOGIN)
            .then()
            .spec(getResponseSpecification()).
            assertThat().statusCode(200).extract()
            .response();
}
    public static Response post(Object loginPayload,String token,String path){
        return given(getRequestSpecification())
                .header("x-access-token",token)
                .body(loginPayload).
                when()
                .post(path)
                .then()
                .spec(getResponseSpecification()).
                assertThat().statusCode(200).extract()
                .response();
    }

}
