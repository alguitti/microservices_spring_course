package br.com.andre.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.andre.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		
		//por enquanto mockado
		return new Payment("André", 200.0, days);
		
	}
	
	
}
