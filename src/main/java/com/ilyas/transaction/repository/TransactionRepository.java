package com.ilyas.transaction.repository;

// import java.time.LocalDateTime;
import java.util.List;
// import java.util.Optional;

import com.ilyas.transaction.model.Transaction;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.Query;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    
    // @Query(value = "{date:'?0'}", fields = "{'customer_name': 1, 'date': 1, 'cash': 1, 'change': 1}")
    // List<Transaction> findByDateLike(LocalDateTime date);

    // @Query(value = "{id}")
    // Optional<Transaction> findById(String id);

    // @Query(fields = "{'customer_name': 1, 'date': 1, 'cash': 1, 'change': 1}")
    List<Transaction> find();

    // @Query
    // Transaction saveTransaction(Transaction t);

    public long count();
}