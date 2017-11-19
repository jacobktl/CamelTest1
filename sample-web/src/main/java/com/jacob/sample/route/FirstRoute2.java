package com.jacob.sample.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute2 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
       // from("file:D:/temp/inputFolder2?noop=true")
        from("cxf:bean:helloWorld1")        
        .process(new FirstProcessor())
        .to("log:request");
    }
}
