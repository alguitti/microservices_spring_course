package br.com.andre.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.andre.hrpayroll.entities.Payment;
import br.com.andre.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	private static final String PATH = "/workers/{id}";
	
	public Payment getPayment(long workerId, int days) {
		
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("id", String.valueOf(workerId));
		
		
		Worker worker = restTemplate.getForObject(workerHost + PATH, Worker.class, uriVariable);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}
	
	
}
