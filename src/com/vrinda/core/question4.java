package com.vrinda.core;

import java.util.Scanner;
import java.util.Stack;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			
		Stack<Integer> s1=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		
		int size1;
			System.out.println("Enter Size 1st : ");
			size1=sc.nextInt();
		int set;
		System.out.println("Enter the elements : ");
			for(int i=0;i<size1;i++)
				{	set=sc.nextInt();
					s1.push(set);
				}
			
		Stack<Integer> s2=new Stack<Integer>();
		
		while(!s1.isEmpty())
		{
			int temp=s1.pop();
			
			while(!s2.isEmpty() && s2.peek() < temp)
			{
				s1.push(s2.pop());
			}
			
			s2.push(temp);
		}
		System.out.println(" output :");
		while(!s2.isEmpty()) {

		System.out.print(s2.pop() + " , ");
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
