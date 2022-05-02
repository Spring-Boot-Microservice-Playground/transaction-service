package com.ilyas.transaction;

import java.util.List;

import com.ilyas.transaction.model.Transaction;
import com.ilyas.transaction.repository.TransactionRepository;
import com.ilyas.transaction.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TransactionApplication {

	// @Autowired
	// private TransactionService transactionService;
	@Autowired
	TransactionRepository transactionService;
	
	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

	@GetMapping("/transactions")
	public List<Transaction> getTransactionHistory(){
		return transactionService.findAll();
	}

}
