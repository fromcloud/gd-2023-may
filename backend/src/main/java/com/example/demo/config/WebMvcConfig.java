package com.example.demo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	private final long MAX_AGE_SECS = 3600;

	@Override
	/*
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
						.allowedOrigins("http://localhost:3000", "http://k8s-gamedaygroupfront-33446e889b-1747407836.ap-northeast-1.elb.amazonaws.com")
						.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
						.allowedHeaders("*")
						.allowCredentials(true)
						.maxAge(MAX_AGE_SECS);
	}
	 */
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").maxAge(MAX_AGE_SECS).allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS");
	}
}
