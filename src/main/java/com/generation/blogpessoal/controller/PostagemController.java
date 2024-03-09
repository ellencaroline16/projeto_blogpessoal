package com.generation.blogpessoal.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;


@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {
	
		@Autowired
		private PostagemRepository postagemRepository;
		
		@GetMapping
		public ResponseEnity<List<Postagem>> getAll(){
			return ResponseEnity.ok(postagemRepository.findAll());
			
		}
		
		
	}
	


