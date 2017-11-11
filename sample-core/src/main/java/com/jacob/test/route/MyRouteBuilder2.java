package com.jacob.test.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder2 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D:/temp/inputFolder2?noop=true").process(new FileProcessor()).to("file:D:/temp/outputFolder2");
    }

}
