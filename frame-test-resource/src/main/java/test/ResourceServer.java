package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class ResourceServer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ResourceServer.class, args);
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@Configuration
	static class MyResourceServerConfigurerAdapter extends ResourceServerConfiguration {

		@Override
		public void configure(HttpSecurity http) throws Exception {
			super.configure(http);
			http
				.headers()
					.frameOptions()
						.sameOrigin();

		}

	}
}
