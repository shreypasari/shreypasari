package com.example.soap;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SoapInterface {
	@WebMethod
	String Add(String name);
	
	@WebMethod
	String Delete(String name);
	
	@WebMethod
	String Update(String s1, String s2);
	
	@WebMethod
	public String Get(int S);
}
