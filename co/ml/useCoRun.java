package com.httpTool.co.ml;

public class useCoRun {
	public static void main(String[] args) {
		Config config = new Config();
		config.setProtocolString("http");
		// config.setMethodString("post");
		// config.setUriString("http://testapi.51anlv.com/webservice/postbuy.php");
		// config.setParamString("{\"user\":\"bjkanghui\",\"password\":\"bjkhpassword\",\"userid\":\"bjkhapi\",\"action\":\"getProducts\"}");
		config.setMethodString("post");
		config.setUriString("http://testinterface.webcct.com/getOrderInfo.aspx");
		config.setParamString("{\"erpid\": 0}");
		coRunCase.beginHttp(config);
	}

}
