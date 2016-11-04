package com.sds.model.connection;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component
public class SessionManager {
	
	static private SessionManager instance = new SessionManager();
	private String resource;
	private InputStream inputStream;
	private SqlSessionFactory sqlSessionFactory;
	
	private SessionManager(){
		
		resource = "com/sds/mybatis/config.xml";
		
		try {
			
			inputStream = Resources.getResourceAsStream(resource);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	
	public static SessionManager getInstance() {
	
		if( instance==null ){
			
			instance = new SessionManager();
			
		}
		
		return instance;
	
	}
	
	public SqlSession getSession(){
		
		return sqlSessionFactory.openSession();
		
	}

}
