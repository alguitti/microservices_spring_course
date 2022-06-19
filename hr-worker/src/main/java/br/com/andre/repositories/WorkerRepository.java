package br.com.andre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.andre.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

	//public Worker findByName(String name);
	
}
