package com.app.socialnetwork.error;

public class StudentNotFoundException extends Exception{
	
	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public StudentNotFoundException() 
	{
		super();
	}
	
	public StudentNotFoundException(String msg) 
	{
		super(msg);

	}
	public StudentNotFoundException(String msg,Throwable cause) 
	{
		super(msg, cause);

	}
	
	

}

