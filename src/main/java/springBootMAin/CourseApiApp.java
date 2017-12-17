package springBootMAin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.cache.annotation.EnableCaching;
@SpringBootApplication
@EnableCaching
//@ComponentScan({ "ServicesImpl.TaskServiceImpl" })
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		SpringApplication.run(CourseApiApp.class, args);
		System.out.println("2");

	}

}
