package com.jacob.sample.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D:/temp/inputFolder1?noop=true").process(new FirstProcessor()).to("file:D:/temp/outputFolder1");
    }

}
