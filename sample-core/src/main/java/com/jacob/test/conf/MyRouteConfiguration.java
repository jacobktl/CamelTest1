package com.jacob.test.conf;

import java.util.Arrays;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jacob.test.route.MyRouteBuilder1;
import com.jacob.test.route.MyRouteBuilder2;

@Configuration
@ComponentScan("com.jacob.test.route")
public class MyRouteConfiguration extends CamelConfiguration {

	@Autowired
	private MyRouteBuilder1 myRouteBuilder1;
	@Autowired
	private MyRouteBuilder2 myRouteBuilder2;

	@Override
	public List<RouteBuilder> routes() {
		return Arrays.asList(myRouteBuilder1, myRouteBuilder2);
	}
}
