package com.practicepapers.functions;

import com.resources.utility.Utility;

public class Triplets
{

	public static void main(String[] args)
	{
		System.out.println("Enter number of elements you want in your array");
		
		//Number of elements in an array
        int noOfInputs = Utility.noOfInputs();
        
        //Initializing an array
        int[] array = new int[noOfInputs];
         
        //Storing array Elements
        System.out.println("Input array Elements: ");
        int[] arr = Utility.arrayElements(array);
        
        //Display elements of an array
         Utility.displayElements(arr);

         
        Utility.findTriplets(arr);
         
	}

}
