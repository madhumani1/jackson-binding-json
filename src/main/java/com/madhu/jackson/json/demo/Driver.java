/**
 * 
 */
package com.madhu.jackson.json.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 15197
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create object mapper
		ObjectMapper objectMapper = new ObjectMapper();
		
		// read JSON file and map/convert to Java POJO: 
		// data/sample-lite.json
		try {
			String currentPath = new java.io.File(".").getCanonicalPath();
			System.out.println("Current dir:" + currentPath);
			Student theStudent = objectMapper.readValue(new File("./resources/sample-full.json"), Student.class);
			
			// print first name and last name
			System.out.println("First name = " + theStudent.getFirstName());
			System.out.println("Last name = " + theStudent.getLastName());
			
			// print out address: street and city
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			System.out.println("Province = " + tempAddress.getProvince());
			System.out.println("Postal Code = " + tempAddress.getPostalCode());
			System.out.println("Country = " + tempAddress.getCountry());
			
			// print out languages
			System.out.println("Languages: ");
			for (String tempLang : theStudent.getLanguages()) {
				System.out.println("\t"+tempLang);
			}
			
			// print out company
			//System.out.println("Company = " + theStudent.getCompany());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// print first name and last name

	}

}
