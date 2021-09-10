package com.muf.mp;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;*/



@SpringBootApplication
public class MiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}
	/*
	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
		return args -> {
			Address address = new Address(
					"England",
					"London",
					"15145");
			String email = "jamila@gmail.com";
			Student student = new Student(
					"Cristiano",
					"Ronaldo", 
					email,
					Gender.FEMALE,
					address,
					Arrays.asList("Coumputer Science", "Math"),
					BigDecimal.TEN,
					LocalDateTime.now()
			);
			
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));
			
			repository.findStudentByEmail(email).
			repository.insert(student);
		};
	}*/
}
