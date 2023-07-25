package Luca.Iannice.U5S1D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Luca.Iannice.U5S1D1.Classi.Pizza;
import Services.Size;


@Configuration

public class BeansConfiguration {
	
	@Bean
	String sayHelloWorld () {
		return "Hello World";
	}
	
	@Bean
	Pizza pizzaMargherita () {
		
		return new Pizza("Margherita", Size.FAMILY, 20.00, 600, 34, 35);
		
	}

}

