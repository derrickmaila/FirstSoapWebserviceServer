package com.javacodegeeks.examples.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CalculatorI {
	
	@WebMethod(operationName="AddTest")
	@WebResult(name="addition")
	int add(@WebParam(name="number1")  int a, @WebParam(name="number2")  int b);

	@WebMethod
	@WebResult(name="subtraction")
	int subtract( @WebParam(name="number1")  int a, @WebParam(name="number2") int b);

	@WebMethod
	@WebResult(name="multiplication") 
	int multiply( @WebParam(name="number1")  int a, @WebParam(name="number2") int b);

	@WebMethod
	@WebResult(name="division")
	int divide(@WebParam(name="number1")  int a, @WebParam(name="number2") int b);
}