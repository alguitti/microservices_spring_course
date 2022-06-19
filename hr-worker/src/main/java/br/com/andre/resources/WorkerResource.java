package br.com.andre.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.entities.Worker;
import br.com.andre.services.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerService service;
	
	public static final String ID = "/{id}";
	public static final String NAME = "/{name}";
	
	@GetMapping
	public ResponseEntity<List<Worker>> getAll() {
		
		return ResponseEntity.ok().body(service.findAll());
		
	}
	
	@RequestMapping(value = ID, method = RequestMethod.GET)
	public ResponseEntity<Worker> getByName(@PathVariable Long id) {
		
		return ResponseEntity.ok().body(service.findById(id));
		
	}
	
}
