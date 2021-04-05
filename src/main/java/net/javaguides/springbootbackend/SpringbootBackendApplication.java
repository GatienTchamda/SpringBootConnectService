package net.javaguides.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springbootbackend.model.User;
import net.javaguides.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;


	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Gatien", "Tchamda", "gat12008@yahoo.fr"));
		this.userRepository.save(new User("Dominick", "Ndjandjo", "minkado1@yahoo.fr"));
		this.userRepository.save(new User("Tony", "STark", "tony.stark@yahoo.fr"));
	}

}
