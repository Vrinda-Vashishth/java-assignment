package com.vrinda.core;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String st;
		System.out.println("Enter the String");
		st=sc.nextLine();
		boolean b=palin(st,0,st.length()-1);
		System.out.println("String " +b+ " Palindrome");
		
	}

	static boolean palin(String s,int first, int last)
	{
		
		
		if(first==last)
			return true;
		
		if ((s.charAt(first)) != (s.charAt(last)))
            return false;
		
		if (first < last + 1)
            return palin(s, first + 1, last - 1);
		
		return true;
		
	}
	
	
	

}
