package com.ilyas.transaction.service;

import com.ilyas.transaction.model.Transaction;
import com.ilyas.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;
    @Autowired
    RestTemplate restTemplate;

    public Transaction saveTransaction(Transaction t) throws Exception {
        t.getProducts().stream().forEach(p -> System.out.println(p.getId()));
        t.getProducts().stream().forEach(p -> restTemplate.put("http://product-service/product/purchase", p));
        repository.save(t);
        return t;
    }
}
