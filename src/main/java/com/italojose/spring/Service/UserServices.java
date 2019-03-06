package com.italojose.spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italojose.spring.Repository.UserRepository;
import com.italojose.spring.Service.exception.ObjectNotFoundException;
import com.italojose.spring.domain.User;
import com.italojose.spring.dto.UserDTO;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id){
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
	}
	
	public User insert(User user) {
		return repo.insert(user);
	}
	
	public User fromDTO(UserDTO userDto) {
		return new User(userDto.getId(),userDto.getName(),userDto.getEmail());
	}
}
