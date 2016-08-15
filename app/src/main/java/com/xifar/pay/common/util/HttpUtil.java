package com.xifar.pay.common.util;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.util.Log;

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
	public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
		client.post(url, params, responseHandler);
	}

	public static void main(String[] args) {
		String url = "http://localhost:8080/alipay/internal/sign";
		RequestParams params = new RequestParams();
		params.setContentEncoding("utf-8");
		params.put("this", "htow");
		HttpUtil.post(url, params, new AsyncHttpResponseHandler() {

			@Override
			public void onFailure(int arg0, cz.msebera.android.httpclient.Header[] arg1, byte[] arg2, Throwable arg3) {
				Log.d(TARGET_FLAG, "请求失败");

			}

			@Override
			public void onSuccess(int arg0, cz.msebera.android.httpclient.Header[] arg1, byte[] arg2) {
				Log.d(TARGET_FLAG, "请求成功");

			}
		});
	}

}
