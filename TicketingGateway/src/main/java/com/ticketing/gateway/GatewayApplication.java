package com.ticketing.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import com.ticketing.gateway.filter.CorsFilter;
import com.ticketing.gateway.filter.ErrorFilter;
import com.ticketing.gateway.filter.PostFilter;
import com.ticketing.gateway.filter.PreFilter;
import com.ticketing.gateway.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter(){
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routerFilter() {
		return new RouteFilter();
	}
	
	@Bean
	public CorsFilter corsFilter() {
	    return new CorsFilter();
	}
}
