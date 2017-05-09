package com.example.administrator.coolweatherapplication.util;

import android.text.TextUtils;

import com.example.administrator.coolweatherapplication.db.Provice;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/5/3 0003.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Provice provice = new Provice();
                    provice.setProvinceName(provinceObject.getString("name"));
                    provice.setProviceCode(provinceObject.getInt("id"));
                    provice.save();
                } return  true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        } return false;
    }

}