package com.kaviya.exception;

public class ExceptionDemo {
	public static void main(String...args) {
		
		int i,j;
		i=9;
		j=80;
		
		try 
		{
			int k=i/j;
			if(k==0)
				throw new MyOwnException("value we got zero");
			System.out.println(k);
		}
		catch(MyOwnException e) {
			System.err.println("Error occured \n"+e.getMessage());
		}
	}

}
