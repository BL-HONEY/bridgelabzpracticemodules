package com.practicepapers.functions;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Year of your choice to check whether it's a leap year:(ONLY 4digit are allowed) ");
		int year = sc.nextInt();
		if(check4digits(year))
		{
			if(isLeapYear(year))
			{
				System.out.println("Yes !! a leap year");
			}
			else
			{
				System.out.println("Nope !! Not a leap year");
			}
		}
		else
		{
			System.out.println("Enter a year with 4-digits");
		}
		sc.close();
	}

	private static boolean isLeapYear(int year)
	{
		if(year%400 == 0)
			return true;
		if(year%100 == 0)
			return false;
		if(year%4 == 0)
			return true;
		
		return false;
	}

	private static boolean check4digits(int year)
	{
	  int count = 0;
	   while(year!=0)
	   {
		   ++count;
		   year = year/10;
	   }
	   if(count<4 || count>4)
	   {
		   return false;
	   }
	   else
	   {
		   return true;
	   }
	}

}

