package com.practicepapers.functions;

import java.lang.*;
import java.util.Scanner;

public class PrimeFactors 
{

	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any number: ");
     int num = sc.nextInt();
     
		findPrimeFactors(num);
	}

	private static void findPrimeFactors(int num) 
	{
		//int sqRoot =(int)Math.sqrt(num)+1;
		//System.out.println("sqaure root of " + num + " is "+ sqRoot);
		
		for(int i=1 ; i<=num/2 ; i++)
		{
			if(checkPrime(i) && num%i == 0  )
			System.out.println(i);
		}
		
	}

	private static boolean checkPrime(int i)
	{
		int count = 0;
	   for(int j=2 ; j<i ; j++)
	   {
		   if(i%j==0)
			   count++;
	   }
	   if(count>0)
		   return false;
	   else
		   return true;
	}

}

