package com.vrinda.core;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter the text :");
		   String in=sc.nextLine();
		   //substring
		   System.out.println("Enter the substring : ");
		   String sub=sc.nextLine();
		   //replacing string
		   System.out.println("Enter the replacing string :");
		   String rep=sc.nextLine();
	       String str= in.replace(sub, rep);
           System.out.println(str);
	}
}