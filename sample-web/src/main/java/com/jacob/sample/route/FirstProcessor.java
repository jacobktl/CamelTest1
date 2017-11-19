package com.jacob.sample.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FirstProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("hello");
    }

}
