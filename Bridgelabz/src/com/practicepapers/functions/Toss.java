package com.practicepapers.functions;

import java.util.Scanner;

public class Toss
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of ti,mes you want to toss te coin");
		int times = sc.nextInt();
       if(times>0) //Ensure number of times you want to toss is a positive number
       {
		printpercent(times);
       }
       else
       {
    	   System.out.println("Wrong input");
       }
	}

	private static void printpercent(int times)
	{
		int head = 0,tail=0;
		int temp = times;
	  while(times--!=0)			
	  {
		 head += (int)(Math.random()*100);
		 tail += (int)(Math.random()*100);
	  }
	   double headPerc = head/temp;
	   double tailPerc = tail/temp;
	   
	   System.out.println("Head percent is "+ headPerc);
	   System.out.println("Tail percent is "+ tailPerc);
	  
	}
}

