package br.com.andre.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andre.entities.Worker;
import br.com.andre.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll() {
		
		return repository.findAll();
		
	}
	
	
	public Worker findById(Long id) {
		
		Optional<Worker> optionalWorker = repository.findById(id);
		return optionalWorker.get();
		
	}

}
