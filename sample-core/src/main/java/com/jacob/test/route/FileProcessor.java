package com.jacob.test.route;

import java.util.Set;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;



public class FileProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("hello");
    }

}
