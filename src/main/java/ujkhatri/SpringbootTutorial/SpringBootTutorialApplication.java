package ujkhatri.SpringbootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages= {"ujkhatri.*"})
@EnableAsync
public class SpringBootTutorialApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}
}