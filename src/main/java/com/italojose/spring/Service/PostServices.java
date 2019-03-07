package com.italojose.spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italojose.spring.Repository.PostRepository;
import com.italojose.spring.Service.exception.ObjectNotFoundException;
import com.italojose.spring.domain.Post;

@Service
public class PostServices {
	
	@Autowired
	private PostRepository repo;
	
	public List<Post> findAll() {
		return repo.findAll();		
	}
	
	public Post findById(String id) {
		
		Optional<Post> post = repo.findById(id);
		
		return post.orElseThrow(() ->new ObjectNotFoundException("Not found id")); 
	}

}
