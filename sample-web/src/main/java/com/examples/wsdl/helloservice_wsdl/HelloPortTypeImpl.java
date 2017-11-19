package com.examples.wsdl.helloservice_wsdl;

@org.apache.cxf.annotations.EndpointProperty(key = "soap.no.validate.parts", value = "true") 
public class HelloPortTypeImpl implements HelloPortType{

	public String sayHello(String firstName) {
		// TODO Auto-generated method stub
		return "Helloo "+firstName;
	}

}
