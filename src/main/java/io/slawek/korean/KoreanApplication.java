package io.slawek.korean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:db.properties")

public class KoreanApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoreanApplication.class, args);
	}

}
