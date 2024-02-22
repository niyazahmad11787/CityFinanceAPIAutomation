package com.Cityfinance.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static com.Cityfinance.api.Route.BASEURL;
import static com.Cityfinance.api.Route.LOGIN;

public class SpecBuilder {

    public static RequestSpecification getRequestSpecification() {
        return new RequestSpecBuilder().
                setBaseUri(BASEURL).
                setContentType(ContentType.JSON).
                log(LogDetail.ALL).build();
    }


    public static ResponseSpecification getResponseSpecification(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}