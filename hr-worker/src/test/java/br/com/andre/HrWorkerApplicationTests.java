package br.com.andre;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.andre.entities.Worker;
import br.com.andre.repositories.WorkerRepository;
import br.com.andre.services.WorkerService;

@SpringBootTest
class HrWorkerApplicationTests {

	@InjectMocks
	private WorkerService service;
	
	@Mock
	private WorkerRepository repository;
	
	public static final Long ID = 10L;
	public static final String NAME = "Dummy";
	public static final Double INCOME = 1.0;
	Worker worker = new Worker(null, NAME, INCOME);
	List<Worker> workers = new ArrayList<>();
	
	
	@BeforeEach
	public void setUp() {
		
		MockitoAnnotations.initMocks(this);
		setWorkers();
	
	}

	private void setWorkers() {
		
		Worker worker1 = new Worker(1L, NAME, INCOME);
		Worker worker2 = new Worker(2L, NAME, INCOME);
		Worker worker3 = new Worker(3L, NAME, INCOME);
		workers.addAll(List.of(worker1, worker2, worker3));
		
	}

	@Test
	public void testFindAll() {
		
		when(service.findAll()).thenReturn(workers);
		List<Worker> dummyWorkers = service.findAll();
		assertNotNull(dummyWorkers);
		assertEquals(dummyWorkers.get(1).getId(), workers.get(1).getId());
		
	}
	


}
