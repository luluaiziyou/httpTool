package com.httpTool.co.ml;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class coRunCase {

	public static void beginHttp(Config config) {
		// TODO Auto-generated method stub
		String methodString = config.getMethodString();

		System.out.println("beginHttp");
		if (methodString.toLowerCase().equals("get")) {
			System.out.println("get");
			try {
				coHttpGet.testHttpGet(config);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (methodString.toLowerCase().equals("post")) {
			System.out.println("post");
			try {
				coHttpPost.testHttpPost(config);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("暂不支持该请求方式");
		}
	}
}
