package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Worker;
import com.example.demo.repository.WokerRepository;


@RestController
@RequestMapping(value = "/workers")
public class WokerResource {
	
	@Autowired
	private WokerRepository repository;
	
	@GetMapping()
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) throws Exception{
		Worker woker = repository.findById(id).orElseThrow(() -> new Exception("Usuario nao encontrado"));
		return ResponseEntity.ok(woker);
	}
 
}
