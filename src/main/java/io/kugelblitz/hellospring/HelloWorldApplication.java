package io.kugelblitz.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication {
	String globalName;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@GetMapping("hello")
	public String Hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		globalName = name;
		return String.format("Hello %s", name);
	}
	
	@GetMapping("goodbye")
	public String goodBye() {
		return String.format("Goodbye %s", globalName);
	}
	
}
