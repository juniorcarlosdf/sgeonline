package br.com.sgeonline.api_sgeonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiSgeonlineApplication {

	@GetMapping("/sgeonline")
	public String helloWorld() {
		return "Olá mundo";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiSgeonlineApplication.class, args);
	}
}
