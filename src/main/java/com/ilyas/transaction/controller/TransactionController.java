package com.ilyas.transaction.controller;

import java.time.LocalDate;
import java.util.List;

import com.ilyas.transaction.model.Transaction;
import com.ilyas.transaction.repository.TransactionRepository;
import com.ilyas.transaction.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
	private TransactionService transactionService;
    @Autowired
    private TransactionRepository transactionRepository;

	@GetMapping
	public List<Transaction> getTransactionHistoryToday(@RequestParam("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateTime){
		return transactionRepository.findByDate(dateTime);
	}

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction t){
        try {
            Transaction _t = transactionService.saveTransaction(t);
            return new ResponseEntity<Transaction>(_t, HttpStatus.CREATED);
        } catch(Exception exception){
            exception.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    } 
}
