package com.kaviya.exception;

// exception handling
// try catch finally
// throws  throw  



//Unchecked Exception
public class ExceptionHandlingDemo {
	public static void main(String...args) {
		try
		{
			int i=7;
			int j=7;
		int value=i/j;
		System.out.println(value);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Something wrong");
		}
		finally
		{
		System.out.println("End");
		}
	}

}
