package com.xifar.pay.common.util;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpEntity;

/**
 * Created by wushuang on 2016/8/14.
 */
public class HttpUtil {

    private static String TARGET_FLAG = "HttpUtil";

    private static AsyncHttpClient client = new AsyncHttpClient();

    /**
     * GET请求
     **/
    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(url, params, responseHandler);
    }

    /**
     * POST请求
     **/
    public static void post(String url,  HttpEntity entity, String contentType, ResponseHandlerInterface responseHandler) {
        client.post(null,url, entity, contentType, responseHandler);
    }

    public static void main(String[] args) {
        String url = "http://localhost:8080/alipay/internal/sign";
        RequestParams params = new RequestParams();
        params.setContentEncoding("utf-8");
        params.put("this", "htow");
    }

}
