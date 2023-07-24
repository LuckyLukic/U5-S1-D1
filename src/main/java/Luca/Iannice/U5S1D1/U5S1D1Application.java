package Luca.Iannice.U5S1D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5S1D1Application.class, args);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5S1D1Application.class);
		
	    System.out.println(ctx.getBean("sayHelloWorld"));
		
		ctx.close();

		

				
		
	}
	
	

	

}
