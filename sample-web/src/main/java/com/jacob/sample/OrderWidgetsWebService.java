package com.jacob.sample;

import javax.servlet.Servlet;
import javax.xml.ws.Holder;

import org.springframework.web.context.ContextLoaderListener;

import com.widgetvendor.widgetorderform.BadSize;
import com.widgetvendor.widgetorderform.OrderWidgets;

public class OrderWidgetsWebService {//implements OrderWidgets{

	public float placeWidgetOrder(int numOrdered, Holder<byte[]> keyVal)
			throws BadSize {
		System.out.println("its working..");
		ContextLoaderListener ff;
		org.apache.cxf.transport.servlet.CXFServlet sdfg;
		org.apache.cxf.jaxb.JAXBDataBinding gggg;
		return 0;
	}

}
