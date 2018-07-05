package com.vrinda.core;

import java.util.Scanner;

public class question2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the number : ");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+ " :" +factorial(n));
	}
	static int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	
}


