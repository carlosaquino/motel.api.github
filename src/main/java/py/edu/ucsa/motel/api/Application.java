package py.edu.ucsa.motel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import py.edu.ucsa.motel.api.Application;
import py.edu.ucsa.motel.api.JpaConfiguration;

@SpringBootApplication(scanBasePackages={
		"py.edu.ucsa.motel.api.web.controllers",
		"py.edu.ucsa.motel.api.web.services",
		"py.edu.ucsa.motel.api.core.dao"}) 
//Es lo mismo que anotar con @Configuration @EnableAutoConfiguration @ComponentScan
//@EnableJpaRepositories
//@EnableCaching
@Import(JpaConfiguration.class)
public class Application {

		public static void main(String[] args) {
				SpringApplication.run(Application.class, args);
		}
}
