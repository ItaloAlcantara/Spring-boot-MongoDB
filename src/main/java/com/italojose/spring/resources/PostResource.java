package com.italojose.spring.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italojose.spring.Service.PostServices;
import com.italojose.spring.domain.Post;
import com.italojose.spring.dto.PostDTO;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostServices service;

	@GetMapping
	public ResponseEntity<List<PostDTO>> findaAll() {
		
		List<Post> post = service.findAll();
		List<PostDTO> postDto = post.stream().map(x -> new PostDTO(x)).collect(Collectors.toList());
		
		
		return ResponseEntity.ok().body(postDto);
	}
	
	@RequestMapping(value= "/{id}")
	public ResponseEntity<PostDTO> findById(@PathVariable String id){
		
		Post post = service.findById(id);
		
		return ResponseEntity.ok().body(new PostDTO(post));
		
	}

}
