package schedular.Schedular_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SchedularProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedularProjectApplication.class, args);
	}

}
