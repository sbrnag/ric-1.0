package com.ric.mongodb.dao;

import com.mongodb.DBObject;

public abstract class AbstractDAO {
	
  public abstract String save(String json); 
  
  public abstract String update(DBObject dbObj);
  
  public abstract String find(DBObject dbObj);
  
  public abstract String delete(DBObject dbObj);
  
}
