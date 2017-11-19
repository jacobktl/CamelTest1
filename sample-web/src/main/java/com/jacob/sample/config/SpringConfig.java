package com.jacob.sample.config;

import java.util.Arrays;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jacob.sample.route.FirstRoute;
import com.jacob.sample.route.FirstRoute2;

@Configuration
@ComponentScan("com.jacob.sample.route")
public class SpringConfig extends CamelConfiguration {

	@Autowired
	private FirstRoute firstRoute;
	
	
	@Autowired
	FirstRoute2 firstRoute2;
	
	@Override
	public List<RouteBuilder> routes() {
		return Arrays.asList(firstRoute,firstRoute2);
	}
}
