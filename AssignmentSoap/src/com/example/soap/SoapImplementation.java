package com.example.soap;
import java.util.*;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.soap.SoapInterface")

public class SoapImplementation {

	
	ArrayList<String> countryList = new ArrayList<String>(Arrays.asList("India", "Australia", "Pakistan","SouthAfrica"));
	
	
	public String Add(String name) {
		
		countryList.add(name);
		
		return  name + "Added Succesfully";
	}
	
	
	public String Delete(String name) {
		int ind = countryList.indexOf(name);
		countryList.remove(ind);
		return  name +" Deleted succesfully";
	}
	
	
	public String Update(String s1, String s2) {
		int ind = countryList.indexOf(s1);
		countryList.set(ind, s2);
		
		
		return "updated succesfully";
	}
	
	
	public String Get(int s) {
		return countryList.get(s);
		
	}

}
