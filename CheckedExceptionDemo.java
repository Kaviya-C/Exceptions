package com.kaviya.exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// unchecked exception only comes under the
//RuntimeException subclasses are unchecked
// remaining everything checked exception
public class CheckedExceptionDemo {
	public static void main(String...args) throws Exception
	{
		
		System.out.println("Enter a number: ");
		
		//BufferedReader input=null; 
		int n=0;
		try(BufferedReader input=new BufferedReader
				(new InputStreamReader(System.in)))
		{
		n=Integer.parseInt(input.readLine());
		}
		catch(Exception e) 
		{
		   System.out.println(e.getMessage());	
		}
		System.out.println(n);	
	}
	
}

