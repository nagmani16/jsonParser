package com.nagmani.parseJson;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ColorDetails {
	
	private List<Colors> allColor;
	
	@JsonProperty("Colors")
	public List<Colors> getAllColor() {
		return allColor;
	}

	public void setAllColor(List<Colors> allColor) {
		this.allColor = allColor;
	}

}
