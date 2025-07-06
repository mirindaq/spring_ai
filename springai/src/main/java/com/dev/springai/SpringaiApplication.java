package com.dev.springai;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringaiApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.filename("local.env")
				.ignoreIfMissing()
				.load();

		System.setProperty("OPENAI_API_KEY", dotenv.get("OPENAI_API_KEY"));
		SpringApplication.run(SpringaiApplication.class, args);
	}

}
