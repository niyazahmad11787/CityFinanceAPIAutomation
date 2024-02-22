package com.Cityfinance.Tests;

import com.Cityfinance.JsonPayload.WaterRejuvenation;
import com.Cityfinance.api.ApplicationAPI.CityfinanceAPI;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static com.Cityfinance.api.Route.WATERREJUVENATION;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WaterRejuvenationTest {

    public static String token;
    @Test(priority = 1)
    public void stateLogin(){
        HashMap<String, String> payload=new HashMap<String, String>();
        payload.put("email","manishchandrakantshah@gmail.com");
        payload.put("password","state@123");
        Response response= CityfinanceAPI.post(payload);
        assertThat(response.statusCode(),equalTo(200));
        token = JsonPath.from(response.asString()).getString("token");

    }
    @Test(priority = 2)
    public void createWaterRejuvenation(){

        Response response=CityfinanceAPI.post(WaterRejuvenation.postData(),token,WATERREJUVENATION);
        assertThat(response.statusCode(),equalTo(200));


    }
}
