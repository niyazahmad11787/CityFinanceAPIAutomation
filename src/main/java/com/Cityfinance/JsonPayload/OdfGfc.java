package com.Cityfinance.JsonPayload;

import com.Cityfinance.Tests.OdfFormTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OdfGfc {
    public static Object jsonData(){
        //Adding Object 1 ....
        HashMap<String, String> answerObj=new HashMap<>();
        answerObj.put("label","3 Star");
        answerObj.put("textValue","");
        answerObj.put("value","3");
        List<HashMap<String, String>> answer=new ArrayList<>();
        answer.add(answerObj);
        List< HashMap<String, Object>> nestedAnswer=new ArrayList<>();
        nestedAnswer.add(null);
        HashMap<String,Object> dataObj1=new HashMap<>();
        dataObj1.put("answer",answer);
        dataObj1.put("input_type","3");
        dataObj1.put("nestedAnswer",nestedAnswer);
        dataObj1.put("order","1");
        dataObj1.put("shortKey","rating");

        //Adding Object 2....
        HashMap<String, String> answerObj1=new HashMap<>();
        answerObj1.put("label","migrationtesting.pdf");
        answerObj1.put("textValue","https://janaagrahstorage.blob.core.windows.net/jana-cityfinance-stg/ULB/2023-24/annual_accounts/KA122/niyaz_a0fa75e0-b92d-4f3b-9e7d-e5b0e33c1ec7.pdf");
        answerObj1.put("value","https://janaagrahstorage.blob.core.windows.net/jana-cityfinance-stg/ULB/2023-24/annual_accounts/KA122/niyaz_a0fa75e0-b92d-4f3b-9e7d-e5b0e33c1ec7.pdf");
        List<HashMap<String, String>> answer1=new ArrayList<>();
        answer1.add(answerObj);
        HashMap<String,Object> dataObj2=new HashMap<>();
        dataObj2.put("answer",answer1);
        dataObj2.put("input_type","3");
        dataObj2.put("nestedAnswer",nestedAnswer);
        dataObj2.put("order","2");
        dataObj2.put("shortKey","cert");
        dataObj2.put("pattern","");

        //Adding Object 3....
        HashMap<String, String> answerObj2=new HashMap<>();
        answerObj2.put("label","");
        answerObj2.put("textValue","");
        answerObj2.put("value","");
        List<HashMap<String, String>> answer2=new ArrayList<>();
        answer.add(answerObj2);
        HashMap<String,Object> dataObj3=new HashMap<>();
        dataObj3.put("answer",answer2);
        dataObj3.put("input_type","11");
        dataObj3.put("nestedAnswer",nestedAnswer);
        dataObj3.put("order","4");
        dataObj3.put("shortKey","cert_declaration");
        dataObj3.put("pattern","");

        //Adding Object 3..

        HashMap<String, String> answerObj3=new HashMap<>();
        answerObj3.put("label","");
        answerObj3.put("textValue","2023-03-10");
        answerObj3.put("value","2023-03-10");
        List<HashMap<String, String>> answer3=new ArrayList<>();
        answer3.add(answerObj);
        HashMap<String,Object> dataObj4=new HashMap<>();
        dataObj4.put("answer",answer3);
        dataObj4.put("input_type","14");
        dataObj4.put("nestedAnswer",nestedAnswer);
        dataObj4.put("order","3");
        dataObj4.put("shortKey","certDate");
        dataObj4.put("pattern","");

        List<HashMap<String, Object>> dataObj=new ArrayList<>();
        dataObj.add(dataObj1);
        dataObj.add(dataObj2);
        dataObj.add(dataObj3);
        dataObj.add(dataObj4);


        HashMap<String,Object> jsonObject=new HashMap<>();
        jsonObject.put("design_year", OdfFormTests.fY2324);
        jsonObject.put("ulb", OdfFormTests.ulbId);
        jsonObject.put("isGfc",false);
        jsonObject.put("isDraft",false);
        jsonObject.put("status",3);
        jsonObject.put("actionTakenByRole","ULB");
        jsonObject.put("data",dataObj);

        return jsonObject;




    }
}
