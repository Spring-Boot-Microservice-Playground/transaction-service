package com.ilyas.transaction;

import java.util.List;

import com.ilyas.transaction.service.TransactionService;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TransactionApplication {

	@Autowired
	private TransactionService transactionService;
	
	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

	@GetMapping("/transactions")
	public List<Document> getTransactionHistory(){
		return transactionService.getTransactionHistory();
	}

}
