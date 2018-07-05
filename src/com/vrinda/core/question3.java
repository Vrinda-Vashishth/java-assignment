package com.vrinda.core;

import java.util.HashSet;
import java.util.Scanner;

public class question3 {
	
	public static void main(String args[])
	{
		HashSet set1=new HashSet();
		HashSet set2=new HashSet();
		Scanner sc=new Scanner(System.in);
		
		int size1;
		System.out.println("Enter Size 1st : ");
		size1=sc.nextInt();
		int set;
		System.out.println("Insert All 1st Elements:");
		for(int i=0;i<size1;i++)
		{	set=sc.nextInt();
			set1.add(set);
		}
		
		System.out.println("Enter Size 2nd :");
		int size2;
		size2=sc.nextInt();
		System.out.println("Insert All 2nd Elements:");
		for(int i=0;i<size2;i++)
		{	set=sc.nextInt();
			set2.add(set);
		}
		System.out.println("Output");
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		
	}

}
