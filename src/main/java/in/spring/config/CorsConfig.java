/*This config class is used to overcome CORS issue, and share resources to the Angular App*/
package in.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")	//Allow request from localhost:4200 Angular app
					.allowedOrigins("*")
					.allowedMethods("GET","POST","PUT","DELETE")
					.allowedHeaders("*");
	}
}
