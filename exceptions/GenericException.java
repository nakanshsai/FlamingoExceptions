package com.flamingo.exceptions;

public class GenericException extends Exception
{
	
	private String errormessage;
	
	public GenericException() 
	{
		System.out.println("Something went wrong.Please Be Patient.");
	}

	public GenericException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}
	
}
