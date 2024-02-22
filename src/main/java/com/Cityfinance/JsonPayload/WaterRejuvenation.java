package com.Cityfinance.JsonPayload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WaterRejuvenation {
    public static Object postData() {
        HashMap<String, String> photoObj = new HashMap<String, String>();
        photoObj.put("url", "https://democityfinance.s3.ap-south-1.amazonaws.com/STATE/2021-22/projects_wss/CG/Screenshot%20from%202023-07-10%2017-21-42_f9e0043e-941c-46b2-93e3-f06355ed1380.png");
        photoObj.put("name", "Screenshot from 2023-07-10 17-21-42.png");

        List<HashMap<String, String>> photos = new ArrayList<>();
        photos.add(photoObj);
        HashMap<String, Object> waterBodies1 = new HashMap<>();
        waterBodies1.put("name", "bhbh");
        waterBodies1.put("area", "50");
        waterBodies1.put("nameOfBody", "bhhh");
        waterBodies1.put("lat", "28.45922");
        waterBodies1.put("long", "77.07244");
        waterBodies1.put("photos", photos);
        waterBodies1.put("bod", "1");
        waterBodies1.put("cod", "1");
        waterBodies1.put("do", "1");
        waterBodies1.put("tds", "1");
        waterBodies1.put("turbidity", "1");
        waterBodies1.put("bod_expected", "1");
        waterBodies1.put("cod_expected", "1");
        waterBodies1.put("do_expected", "1");
        waterBodies1.put("tds_expected", "1");
        waterBodies1.put("details", "cfyukfvu");
        waterBodies1.put("dprPreparation", "Yes");
        waterBodies1.put("dprCompletion", "Yes");
        waterBodies1.put("workCompletion", "23");
        waterBodies1.put("isDisable", "true");

        HashMap<String, Object> waterBodies2 = new HashMap<>();
        waterBodies2.put("name", "jnkvbefv");
        waterBodies2.put("area", "12");
        waterBodies2.put("nameOfBody", "bhvhlb");
        waterBodies2.put("lat", "28.45930");
        waterBodies2.put("long", "77.07305");
        waterBodies2.put("photos", photos);
        waterBodies2.put("bod", "1");
        waterBodies2.put("cod", "1");
        waterBodies2.put("do", "1");
        waterBodies2.put("tds", "1");
        waterBodies2.put("turbidity", "1");
        waterBodies2.put("bod_expected", "1");
        waterBodies2.put("cod_expected", "1");
        waterBodies2.put("do_expected", "1");
        waterBodies2.put("tds_expected", "1");
        waterBodies2.put("details", "dftvlyuhj");
        waterBodies2.put("dprPreparation", "No");
        waterBodies2.put("dprCompletion", null);
        waterBodies2.put("workCompletion", null);
        waterBodies2.put("isDisable", "true");

        HashMap<String, Object> waterBodies3 = new HashMap<>();
        waterBodies3.put("name", "bhbh");
        waterBodies3.put("area", "30");
        waterBodies3.put("nameOfBody", "hinjbnj");
        waterBodies3.put("lat", "28.45760");
        waterBodies3.put("long", "28.45760");
        waterBodies3.put("photos", photos);
        waterBodies3.put("bod", "1");
        waterBodies3.put("cod", "1");
        waterBodies3.put("do", "1");
        waterBodies3.put("tds", "1");
        waterBodies3.put("turbidity", "1");
        waterBodies3.put("bod_expected", "2");
        waterBodies3.put("cod_expected", "2");
        waterBodies3.put("do_expected", "2");
        waterBodies3.put("tds_expected", "2");
        waterBodies3.put("details", "rryry");
        waterBodies3.put("dprPreparation", "Yes");
        waterBodies3.put("dprCompletion", "No");
        waterBodies3.put("workCompletion", "null");
        waterBodies3.put("isDisable", "true");

        List<HashMap<String, Object>> waterbody = new ArrayList<>();
        waterbody.add(waterBodies1);
        waterbody.add(waterBodies2);
        waterbody.add(waterBodies3);

        HashMap<String, Object> reuseWater = new HashMap<>();
        reuseWater.put("name", "njkn");
        reuseWater.put("treatmentPlant", "23");
        reuseWater.put("targetCust", "43");
        reuseWater.put("lat", "28.45760");
        reuseWater.put("long", "77.07381");
        reuseWater.put("stp", "44");
        reuseWater.put("dprPreparation", "Yes");
        reuseWater.put("dprCompletion", "Yes");
        reuseWater.put("workCompletion", "54");
        reuseWater.put("isDisable", "true");
        List<HashMap<String, Object>> reUseWater = new ArrayList<>();
        reUseWater.add(reuseWater);

        HashMap<String, Object> serviceLevel = new HashMap<>();
        serviceLevel.put("name", "fergfg");
        serviceLevel.put("component", "erfgerg");
        serviceLevel.put("indicator", "7");
        serviceLevel.put("existing", "12");
        serviceLevel.put("after", "21");
        serviceLevel.put("cost", "40");
        serviceLevel.put("dprPreparation", "Yes");
        serviceLevel.put("dprCompletion", "Yes");
        serviceLevel.put("workCompletion", "43");
        serviceLevel.put("isDisable", "true");
        serviceLevel.put("bypassValidation", "true");
        List<HashMap<String, Object>> serviceLevelIndicators = new ArrayList<>();
        serviceLevelIndicators.add(serviceLevel);

        HashMap<String, Object> uaData = new HashMap<>();
        uaData.put("ua", "6130d5a5f9c6d7756b1744cb");
        uaData.put("status", "Submission Acknowledged By MoHUA");
        uaData.put("rejectReason", "");
        uaData.put("waterBodies", waterbody);
        uaData.put("reuseWater", reUseWater);
        uaData.put("serviceLevelIndicators", serviceLevelIndicators);
        uaData.put("foldCard", "true");

        List<HashMap<String, Object>> uadata = new ArrayList<>();
        uadata.add(uaData);

        HashMap<String, String> declaration = new HashMap<>();
        declaration.put("url", "https://democityfinance.s3.ap-south-1.amazonaws.com/STATE/2022-23/projects_wss/CG/fiscalRanking_2022-23_b50321ce-f654-44b2-be6c-63330bddfe3d.pdf");
        declaration.put("name", "fiscalRanking_2022-23.pdf");


        HashMap<String, Object> main = new HashMap<>();
        main.put("state", "5dcf9d7216a06aed41c748e0");
        main.put("design_year", "606aafc14dff55e6c075d3ec");
        main.put("uaData", uadata);
        main.put("status", "3");
        main.put("declaration", declaration);
        main.put("isDraft", "true");

        return main;
    }
}