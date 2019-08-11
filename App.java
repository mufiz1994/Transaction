package com.test;



import javax.naming.Context;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class App {
	
	//static final Logger log = LoggerFactory.getLogger(App.class);
	
	public static Object handleRequest(Request request,Context context) throws ResourceNotFoundException{
		
		AmazonDynamoDB client= AmazonDynamoDBClientBuilder.defaultClient();
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		
		ApprovedTransactions atTransactions = null;
		switch (request.getHttpmethod()) {
		case "GET":
			atTransactions = mapper.load(ApprovedTransactions.class,request.gettransaction_id());
			if (atTransactions == null) 
			{
				throw new ResourceNotFoundException("Resource Not Found:" + request.gettransaction_id());
				}
			return atTransactions;
		case "POST":
			atTransactions = request.getatransaction();
			mapper.save(atTransactions);
			return atTransactions;
		default:
			
			break;
		}
		return null;
		
	}
}
