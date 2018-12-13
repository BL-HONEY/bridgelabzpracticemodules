package com.practicepapers.algorithms;

import com.resources.utility.Utility;

public class Prime {

	public static void main(String[] args) 
	{
     System.out.println("Enter a range upto which you want list of prime numbers: ");
     int range = Utility.getInt();
     
     Utility.printAllPrimes2(range);
		
	}

}
