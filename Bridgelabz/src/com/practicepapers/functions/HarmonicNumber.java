package com.practicepapers.functions;

import java.util.Scanner;

public class HarmonicNumber 
{

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the index of harnomic number you want to display: ");
      int index = sc.nextInt();
      
      findHarmonicNum(index);
		
	}

	private static void findHarmonicNum(int index)
	{
		double requiredNum = 1.0;
		double temp = 1;
		while(temp++ != index)
		{
		  	requiredNum += 1/temp;
		}
		System.out.println(index+"th harmonic number is "+ requiredNum);
	}

}
