package com.italojose.spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.italojose.spring.Repository.UserRepository;
import com.italojose.spring.domain.User;

@Configuration
public class Instatiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null,"Maria Silva","maria2019@gmail.com");
		User alex = new User(null,"Alex Green","alex@gmail.com");
		User carlos = new User(null,"Carlos Antonio","CarlosAnt@gmail.com");
		User italo = new User(null,"Italo Jose","Italo.ADM31@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,carlos,italo));
		
	}

}
