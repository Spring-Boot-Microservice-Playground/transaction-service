package com.ilyas.transaction.repository;

import java.time.LocalDate;
import java.util.List;

import com.ilyas.transaction.model.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    @Query("{date:{$gte:?0}}")
    List<Transaction> findByDate(LocalDate dateTime);
}
