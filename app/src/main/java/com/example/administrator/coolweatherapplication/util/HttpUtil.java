package com.example.administrator.coolweatherapplication.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/5/3 0003.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String addres,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(addres).build();
        client.newCall(request).enqueue(callback);
    }
}
