package com.ric.mongodb.database;

import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoUtil {

	private final static Logger logger = LoggerFactory
			.getLogger(MongoUtil.class);

	// make use of properties values.
	private static final int port = 27017;
	private static final String host = "localhost";
	private static MongoClient mongodb = null;
	private static DB db = null;

	static {

		if (mongodb == null) {
			try {
				mongodb = new MongoClient(host, port);
				db = mongodb.getDB(DBConstants.RIC_DATABASE);
			} catch (UnknownHostException e) {
				logger.error(e.getMessage());
			}
		}

	}

	public static DBCollection getCollection(String collName) {
		// use exception handling technique to handle null pointer.
		DBCollection collection = null;
		if(db != null) {
			collection = db.getCollection(collName);
		}
		return collection;
	}

}