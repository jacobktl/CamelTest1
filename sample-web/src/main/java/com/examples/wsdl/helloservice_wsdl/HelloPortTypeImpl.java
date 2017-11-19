package com.examples.wsdl.helloservice_wsdl;

@org.apache.cxf.annotations.EndpointProperty(key = "soap.no.validate.parts", value = "true") 
public class HelloPortTypeImpl implements HelloPortType{

	public String sayHello(String firstName) {
		// TODO Auto-generated method stub
		System.out.println("its is called with : "+firstName);
		org.apache.cxf.transport.http.DestinationRegistry ttyy;
		return "Helloo "+firstName;
	}

}
