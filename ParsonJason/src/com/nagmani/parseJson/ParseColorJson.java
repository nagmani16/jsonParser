package com.nagmani.parseJson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.*;



public class ParseColorJson {

	public static void main(String[] args) throws JsonParseException,JsonMappingException,IOException {
		
		
		 ObjectMapper objectMapper= new  ObjectMapper();
		 
	//	 objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		 
 
		 System.out.println(System.getProperty("user.dir")+"\\color.json");
		 ColorDetails color= objectMapper.readValue(new File(System.getProperty("user.dir")+"\\color.json"), ColorDetails.class);
		 System.out.println(color.getAllColor().size());
		 
		 Colors [] c = new Colors [color.getAllColor().size()];
		 c = color.getAllColor().toArray(c);
		 
		 for (Colors col: c){
			 System.out.println("The color name is " + col.getColorName() + " " + "and their hex value is " + col.getHexvalue() );
		 }
		 				 
		
		 
		
		
	//	System.out.println(jsonData);

	}

}
