package com.jacob.test.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

abstract@Component
public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("file:D:/temp/inputFolder?noop=true").process(new FileProcessor()).to("file:D:/temp/outputFolder");
    }

}
