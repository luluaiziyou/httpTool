package com.httpTool.co.ml;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class coHttpGet {

	public static void testHttpGet(Config config) throws IOException {
		String uri = config.getUriString();
		String paramString = config.getParamString();
		// TODO Auto-generated method stub
		int code;
		CloseableHttpClient client = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		HttpGet get = null;

		if ((paramString) == null || paramString.length() == 0) {

			get = new HttpGet(uri);

		} else {
			uri = uri + "?" + paramString;
			System.out.println("带参数的uri=====" + uri);
			get = new HttpGet(uri.toString());
		}
		// 发送请求，返回结果并分析

		try {
			response = client.execute(get);
			// 打印回包状态码
			code = response.getStatusLine().getStatusCode();
			System.out.println("回包状态码：" + code);
			// 打印回包头信息
			Header[] headers = response.getAllHeaders();
			for (Header header : headers) {
				System.out.println(header.getName() + "======="
						+ header.getValue());
			}
			// 打印包体内容
			HttpEntity entity = response.getEntity();

			System.out.println("包体内容===="
					+ EntityUtils.toString(entity, "utf-8"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			response.close();
		}

	}
}
