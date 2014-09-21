package com.ric.mongodb.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.ric.mongodb.database.DBConstants;
import com.ric.mongodb.database.MongoUtil;

public class UsersDAO extends AbstractDAO {
	
	private DBCollection collection;
	
	public UsersDAO() {
		collection = MongoUtil.getCollection(DBConstants.USERS_COLLECTION);
	}

	@Override
	public String save(String user) {
		// TODO Auto-generated method stub
		
		BasicDBObject dbObj = (BasicDBObject)JSON.parse(user);
		collection.save(dbObj);
		return "success";
	}

	@Override
	public String update(DBObject dbObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String find(DBObject dbObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(DBObject dbObj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
