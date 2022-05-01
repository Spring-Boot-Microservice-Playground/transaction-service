package com.ilyas.transaction.service;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private MongoClient client = MongoClients.create("mongodb://127.0.0.1:27017");
    private MongoDatabase transactionDatabase = client.getDatabase("transaction-ms-playground");
	private MongoCollection<Document> transacCollectionCollection = transactionDatabase.getCollection("transaction");

    public TransactionService() {
    }
    
    public List<Document> getTransactionHistory(){
        List<Document> result = new ArrayList<Document>();
		transacCollectionCollection.find().forEach(result::add);
		return result;
    }
}
