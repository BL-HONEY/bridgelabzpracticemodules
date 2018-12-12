package com.practicepapers.functions;

import com.resources.utility.Utility;

/**
 * A Program for reading in 2D arrays of integers, doubles, or booleans from
 *  standard input and printing them out to standard output.
 * @author honey
 *
 */

public class TwoDimentionArray {

	public static void main(String[] args)
	{
        //Scan row value from user
		System.out.println("Enter row limit ");
		int rowLimit = Utility.getInt();
		
		//Scan row value from user
		System.out.println("Enter row limit ");
		int colmLimit = Utility.getInt();	
		
		//Initialize array
		int[][] array = new int[rowLimit][colmLimit];
		
		//Storing elements in array
		int[][] matrix = Utility.twoDArrayElements(array, rowLimit, colmLimit);
		
		//Displaying Array Elements
		Utility.display2DElements(matrix, rowLimit, colmLimit);
		
	}

}
