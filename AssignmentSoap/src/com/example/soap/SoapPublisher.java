package com.example.soap;
import javax.xml.ws.Endpoint;
public class SoapPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/SoapInterface", new SoapImplementation());
		
	}

}
