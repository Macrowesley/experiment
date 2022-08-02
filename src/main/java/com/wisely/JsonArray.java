package com.wisely;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//将json格式的数据转换成数组格式
public class JsonArray {
    public static void main(String[] args) throws JSONException {
        String aa = "[{\"dictFont\":\"&#xe62b;\",\"dictId\":\"wap\",\"dictName\":\"无线&手淘\"},{\"dictFont\":\"&#xe62a;\",\"dictId\":\"etao\",\"dictName\":\"搜索\"}]";
        JSONObject jsonResult = new JSONObject();
        JSONArray jsonArray = new JSONArray(aa);

        jsonResult.put("aaa", jsonArray);

        System.out.println(jsonResult);
    }
}
