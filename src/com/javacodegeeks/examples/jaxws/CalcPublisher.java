package com.javacodegeeks.examples.jaxws;

import javax.xml.ws.Endpoint;

public class CalcPublisher {

	public static void main(String[] args) {
		System.out.println("WebService is starting.........");
		Endpoint ep = Endpoint.create(new CalculatorImpl());
		ep.publish("http://127.0.0.1:10001/calcServer");
		
	}

}