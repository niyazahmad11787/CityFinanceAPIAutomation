package com.Cityfinance.Tests;

import com.Cityfinance.JsonPayload.OdfGfc;
import com.Cityfinance.POJO.Login;
import com.Cityfinance.api.ApplicationAPI.CityfinanceAPI;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static com.Cityfinance.api.Route.ODFGFC;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Test
public class OdfFormTests {

    public static String ulbId;
    public static String fY2324;
    public String token;
    public void Login(){

        HashMap<String,String> loginPayload=new HashMap<>();
        loginPayload.put("email","801801");
        loginPayload.put("password","ulb@123");
        Response response=CityfinanceAPI.post(loginPayload);
        assertThat(response.statusCode(),equalTo(200));

        //Getting data from Response Body.....................
         token = JsonPath.from(response.asString()).getString("token");
         ulbId = JsonPath.from(response.asString()).getString("user.ulb");
         fY2324 = JsonPath.from(response.asString()).getString("allYears.2023-24");

         System.out.println(token);
         System.out.println(ulbId);
         System.out.println(fY2324);

    }
    public void createOdfGfc(){
        Response response=CityfinanceAPI.post(OdfGfc.jsonData(),token,ODFGFC);
        assertThat(response.statusCode(),equalTo(200));
        assertThat(response.jsonPath().getString("status"),equalTo("true"));
    }
}
