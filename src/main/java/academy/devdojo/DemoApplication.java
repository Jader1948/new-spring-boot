package academy.devdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(DemoApplication.class, args);
	}

}
