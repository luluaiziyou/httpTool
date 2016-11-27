package com.httpTool.co.ml;

import org.testng.annotations.Test;

public class coTest {
	@Test
	public void f() {
		Config config = new Config();
		config.setProtocolString("http");
		config.setMethodString("post");
		config.setUriString("http://testinterface.webcct.com/getOrderInfo.aspx");
		config.setParamString("\"erpid\": 0");

		coRunCase.beginHttp(config);
	}

}
