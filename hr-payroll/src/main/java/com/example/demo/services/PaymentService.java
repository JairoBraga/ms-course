package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entites.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
