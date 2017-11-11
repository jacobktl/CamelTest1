package com.jacob.test.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder1 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D:/temp/inputFolder1?noop=true").process(new FileProcessor()).to("file:D:/temp/outputFolder1");
    }

}
