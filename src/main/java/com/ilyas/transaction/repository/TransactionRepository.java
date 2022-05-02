package com.ilyas.transaction.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.ilyas.transaction.model.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findAll();
    List<Transaction> findByDate(LocalDateTime date);
}
