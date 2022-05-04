package com.ilyas.transaction.service;

import java.time.LocalDate;
import java.util.List;

import com.ilyas.transaction.model.Transaction;
import com.ilyas.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;
    
    public List<Transaction> getTransactionHistoryToday(LocalDate dateTime){
        List<Transaction> result = repository.findByDate(dateTime);
		return result;
    }

    public Transaction saveTransaction(Transaction t){
        repository.save(t);
        return t;
    }
}
