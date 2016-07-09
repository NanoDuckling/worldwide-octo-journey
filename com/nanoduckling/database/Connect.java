package com.nanoduckling.database;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Connect {

	public void connect(){
try{
	MongoClientURI connectionString = new MongoClientURI("mongodb://admin:4601@ds052408.mongolab.com:52408/fireworldfactionsdb");
	MongoClient mongoClient = new MongoClient(connectionString);
	MongoDatabase database = mongoClient.getDatabase("fireworldfactionsdb");
	MongoCollection<Document> playerInfo = database.getCollection("playerInfo");
	mongoClient.close();
}catch(Exception exception){
	
}

	}
}
