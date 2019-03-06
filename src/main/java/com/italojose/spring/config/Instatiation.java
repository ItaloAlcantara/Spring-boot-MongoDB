package com.italojose.spring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.italojose.spring.Repository.PostRepository;
import com.italojose.spring.Repository.UserRepository;
import com.italojose.spring.domain.Post;
import com.italojose.spring.domain.User;

@Configuration
public class Instatiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null,"Maria Silva","maria2019@gmail.com");
		User alex = new User(null,"Alex Green","alex@gmail.com");
		User carlos = new User(null,"Carlos Antonio","CarlosAnt@gmail.com");
		User italo = new User(null,"Italo Jose","Italo.ADM31@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,carlos,italo));
		
		Post postMaria = new Post(null, sdf.parse("31/10/2010"), "Maria Silva", "I'll be in Dublin in 2025", maria);
		Post postItalo = new Post(null, sdf.parse("06/03/2019"), "Italo Jose", "I'll be in Galway in 2025", italo);
		
		postRepository.saveAll(Arrays.asList(postMaria,postItalo));
	}

}
