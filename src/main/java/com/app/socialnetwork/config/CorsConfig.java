package com.app.socialnetwork.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig {
	protected String pathPattern;

	@Value("${allowed.origin}")
	private String allowedOrigin;
	
	@Bean
	public WebMvcConfigurer getCorsConfiguration()
	{
		return new WebMvcConfigurer() {
			
			public void addCorsMapping(CorsRegistry registry)
			{
				registry.addMapping("/**").allowedMethods("http://localhost:4200")
				.allowedMethods("GET","POST","DELETE","PUT").allowedHeaders("*");
			}
			
		};
		
	}

}
