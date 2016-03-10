package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@EnableResourceServer
@ComponentScan
public class ResourceServer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ResourceServer.class, args);
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

}
