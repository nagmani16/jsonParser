package com.nagmani.parseJson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Colors {
	
	private String colorName;
	private String hexValue;
	
	@JsonProperty("colorName")

	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	@JsonProperty("hexValue")

	public String getHexvalue() {
		return hexValue;
	}
	public void setHexvalue(String hexValue) {
		this.hexValue = hexValue;
	}
	
	

}
