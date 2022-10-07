package es.macero.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import es.macero.dev.restexample.SpanishGreeting;

@SpringBootApplication(scanBasePackages="es.macero")
@EnableSwagger2
@EnableAutoConfiguration
public class SpringBootRestcontrollerExampleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootRestcontrollerExampleApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/spanish-greeting.*"))
				.build();

         

	}

	/*@Bean
	public SpanishGreetingSpanishGreeting() {
		   
		             return new SpanishGreeting();
		           }*/

}
