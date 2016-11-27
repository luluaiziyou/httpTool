package com.httpTool.co.ml;

import java.io.Serializable;

public class Config implements Serializable {
	// 私有属性
	private String protocolString;
	private String methodString;
	private String uriString;
	private String paramString;

	// 构造函数
	public Config() {

	}

	public Config(String protocolString, String methodString, String uriString,
			String paramString) {
		super();
		this.protocolString = protocolString;
		this.methodString = methodString;
		this.uriString = uriString;
		this.paramString = paramString;
	}

	// getter & setter
	public String getProtocolString() {
		return protocolString;
	}

	public void setProtocolString(String protocolString) {
		this.protocolString = protocolString;
	}

	public String getMethodString() {
		return methodString;
	}

	public void setMethodString(String methodString) {
		this.methodString = methodString;
	}

	public String getUriString() {
		return uriString;
	}

	public void setUriString(String uriString) {
		this.uriString = uriString;
	}

	public String getParamString() {
		return paramString;
	}

	public void setParamString(String paramString) {
		this.paramString = paramString;
	}

	// hashCode & equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((methodString == null) ? 0 : methodString.hashCode());
		result = prime * result
				+ ((paramString == null) ? 0 : paramString.hashCode());
		result = prime * result
				+ ((protocolString == null) ? 0 : protocolString.hashCode());
		result = prime * result
				+ ((uriString == null) ? 0 : uriString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Config other = (Config) obj;
		if (methodString == null) {
			if (other.methodString != null)
				return false;
		} else if (!methodString.equals(other.methodString))
			return false;
		if (paramString == null) {
			if (other.paramString != null)
				return false;
		} else if (!paramString.equals(other.paramString))
			return false;
		if (protocolString == null) {
			if (other.protocolString != null)
				return false;
		} else if (!protocolString.equals(other.protocolString))
			return false;
		if (uriString == null) {
			if (other.uriString != null)
				return false;
		} else if (!uriString.equals(other.uriString))
			return false;
		return true;
	}

	// toString

	@Override
	public String toString() {
		return "Config [protocolString=" + protocolString + ", methodString="
				+ methodString + ", uriString=" + uriString + ", paramString="
				+ paramString + "]";
	}

}
