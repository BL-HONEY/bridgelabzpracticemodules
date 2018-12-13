package com.resources.utility;

import java.util.Random;
import java.util.Scanner;

/*
 * Utility class for defining all methods
 */

public class Utility 
{
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	  static int count1=1;

	
	public static void main(String[] args)
	{
       


	}
	
	/**
	 * Method to get a word from User
	 * @return
	 */
	public static String getStringAsWord()
	{
		String st = sc.next();
		return st;
	}
	
	/**
	 * Method to get a line from User
	 * @return
	 */
	public static String getStringAsLine()
	{
		String st = sc.nextLine();
		return st;
	}
	
	
	
	/**
	 * A Method to take Int type as an input
	 * @return
	 */
	
	public static int getInt()
	{
	    int	i = sc.nextInt();
		return i;	
	}
	
	/**
	 * Method to take number of elements for an 1D array
	 * @return
	 */
   
	public static int noOfInputs()
	{
		int i = sc.nextInt();
		return i;
	}
	
	/**
	 * Method to store Elements of an 1D array
	 * @param array
	 * @return
	 */
	
	public static int[] arrayElements(int[] array)
	{
		int i;
		for(i=0 ; i<array.length;i++)
		{
		  array[i] = sc.nextInt();
		}
		return array;	
	}
	
	/**
	 * Method to Add elements to 2-D array
	 * @param array
	 * @param rowLimit
	 * @param colmLimit
	 * @return
	 */
	
	public static int[][] twoDArrayElements(int[][] array,int rowLimit,int colmLimit)
	{
		int i,j;
		System.out.print("Enter Elements: ");
		for(i=0 ; i<rowLimit ; i++)
		{
			for(j=0 ; j<colmLimit ; j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		return array;	
	}
	
	/**
	 *Method to print elements of 2-D array 
	 * @param matrix
	 * @param rowLimit
	 * @param colmLimit
	 */
	public static void display2DElements(int[][] matrix,int rowLimit,int colmLimit)
	{
	 System.out.print("Elements in array is: ");
	 int i,j;
		for(i=0 ; i<rowLimit ; i++)
		{
			for(j=0 ; j<colmLimit ; j++)
			{
			System.out.print(matrix[i][j]+" ");	
			}
			System.out.println();
		}	
     
	}
	
	/**
	 * Method to display elements of 1D array
	 * @param array
	 */
	
	public static void displayElements(int[] array)
	{
		System.out.print("Elements in array is: ");
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.print(array[i]+ ",");
		}
		System.out.println(" ");
	}
	
	/**
	 * Method to find triplet with sum 0
	 * @param array
	 */
	
	public static void findTriplets(int[] array)
	{
		int i,j,k;
		boolean find = false;
		
		for(i=0;i<array.length-2;i++)
		{
			for(j=i+1;j<array.length-1;j++)
			{
				for(k=j+1;k<array.length;k++)
				{
					if(array[i] + array[j] + array[k] == 0)
					{
						find = true;
						System.out.println("[" + array[i] + "," + array[j] + "," + array[k] + "]");
					}
				}

			}

		}
		if(find==false)
			System.out.println("not found");
			
	}
	
	/**
	 * Method to find permutations of a String
	 * @param st
	 * @param first
	 * @param last
	 */
	
	public static void findPermutations(String st, int first , int last)
	{
	  
	  if(first == last)
	  {
		  System.out.println(count1 + " "+ st);
		  count1++;
	  }
	  else
	  {
		  for(int i = first ; i <= last ;i++)
		  {
			  st = swap(st,first,i);
			  findPermutations(st,first+1,last);
			  st = swap(st,first,i);
		  }
	  }
		
	}
	/**
	 * Method to swap character in a String
	 * @param st
	 * @param i
	 * @param j
	 * @return
	 */
	
	public static String swap(String st,int i,int j)
	{
		 char temp; 
	        char[] charArray = st.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray);
	}
	
	/**
	 * Method to represent an Quadratic Equation
	 * @param a
	 * @param b
	 * @param c
	 */
	
	public static void representQuadratic(int a , int b , int c)
	{
		System.out.println(a+"x`2 "+"+ "+b+"x "+"+ "+c);
	}
	
	public static int[] findRoots(int a , int b , int c)
	{
		double delta = b*b + 4*a*c;
		int root1 = (int)(-b + Math.sqrt(delta))/(2*a);
		int root2 = (int)(-b - Math.sqrt(delta))/(2*a);
		
		return new int[] {root1,root2};
	}
	
	
	public static int decider(int stack,int target,int bet)
	{
		int loss=0,win=0,turns=0;
		
		while(stack>=0 && stack<=target)
		{

			int flag = rand.nextInt(2);
			if(flag==0)
			{
			  stack = stack - bet;
			  ++loss;	  
			}
			else
			{
				stack = stack + bet;
				++win;
			}	
		}
		
		turns = loss + win;
		
		calPercentage(win,loss,turns);
		
		return win;
	}
	
	public static void calPercentage(int win,int loss,int turns)
	{
		double winPercent = (double)(win*100/turns);
		double lossPercent = (double)(loss*100/turns);
		
		System.out.println("WIN Percentage: "+ winPercent);
		System.out.println("LOSS Percentage: "+ lossPercent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}