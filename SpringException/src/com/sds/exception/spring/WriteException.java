package com.sds.exception.spring;

import org.springframework.dao.DataAccessException;

public class WriteException extends DataAccessException{

	public WriteException( String msg ) {
		
		super(msg);
		
	}
	
	public WriteException( String msg, Throwable e ) {
		
		super(msg);
		
	}

}
