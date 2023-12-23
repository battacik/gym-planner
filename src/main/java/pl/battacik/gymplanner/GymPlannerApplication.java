package pl.battacik.gymplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class GymPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymPlannerApplication.class, args);
	}

}
