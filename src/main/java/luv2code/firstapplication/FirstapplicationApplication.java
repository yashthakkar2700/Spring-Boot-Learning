package luv2code.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(
		scanBasePackages = {"luv2code.firstapplication",
							"luv2code.util"}
)
*/
@SpringBootApplication
public class FirstapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstapplicationApplication.class, args);
	}
}
