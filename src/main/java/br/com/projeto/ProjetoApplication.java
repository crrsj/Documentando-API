package br.com.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Documentando API",
		version ="1.0",
		description = "Documentando uma API que gerencia pessoas",
		contact = @Contact(name = "Carlos",email = "crrsj1@gmail.com",url = "https://www.crrsj1@gmail.com")	
			
	)	
		
	
)
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
