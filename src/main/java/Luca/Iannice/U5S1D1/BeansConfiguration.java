package Luca.Iannice.U5S1D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class BeansConfiguration {
	
	@Bean
	String sayHelloWorld () {
		return "Hello World";
	}

}
