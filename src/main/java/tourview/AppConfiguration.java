package tourview;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "tourview")
public class AppConfiguration {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		return view;
	}
	
}
