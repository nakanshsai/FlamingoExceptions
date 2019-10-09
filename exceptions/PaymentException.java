package com.flamingo.exceptions;

public class PaymentException extends Exception
{
	private String errormessage;
	
	public PaymentException() 
	{
		System.out.println("Login Failed");
	}

	public PaymentException(String errormessage) 
	{
		super(errormessage);
		this.errormessage = errormessage;
	}
	
}