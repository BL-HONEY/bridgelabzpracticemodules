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
	
	/**
	 * Method to calculate number of wins
	 * @param stack
	 * @param target
	 * @param bet
	 * @return
	 */
	
	
	public static int calWins(int stack,int target,int bet)
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
	
	/**
	 * Method to calculate percentage
	 * @param win
	 * @param loss
	 * @param turns
	 */
	public static void calPercentage(int win,int loss,int turns)
	{
		double winPercent = (double)(win*100/turns);
		double lossPercent = (double)(loss*100/turns);
		
		System.out.println("WIN Percentage: "+ winPercent);
		System.out.println("LOSS Percentage: "+ lossPercent);
	}
	
	/**
	 * Method to check if two strings are Anagrams
	 * @param st1
	 * @param st2
	 * @return
	 */
	
	public static boolean checkAnagram(String st1 , String st2)
	{   
		int[] charValueStore1 = new int[26];
		int[] charValueStore2 = new int[26];
		int i;
		boolean flag = false;
		for(i=0 ; i<st1.length() ; i++)
		{
			charValueStore1[(int)st1.charAt(i)-97]++;
			charValueStore2[(int)st1.charAt(i)-97]++;
			
		}
		
		for(i=0 ; i<charValueStore1.length;i++)
		{
			if(charValueStore1[i]== charValueStore2[i])
			{
		      flag = true;		
	     	}
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	/**
	 * Method to print all prime numbers in a range
	 * @param range
	 */
	
	public static void printAllPrimes1(int range)
	{
	 int index=3,i=1;	
	 boolean flag = true;
	  while(index!=range)
	  {
		  for(i=2; i<index ; i++)
		  {
			  if(index%i == 0)
			  {
				  flag = false;
			  }
			 
			  
		  }
		  if(flag)
		  {
			  System.out.println(index);
		  }
		  flag = true;
		  index++;
	  }
	}
	  
	  public static void printAllPrimes2(int n)
	  {   
		  String[] primes = new String[n];
	      int ncounter = 0;
	      int isPrime = 2;
	      while( ncounter < n){
	        boolean prime = true;
	        for (int j=2; j<isPrime; j++){
	          if (isPrime%j ==0){
	            prime = false;
	            break;
	          }
	        }
	        if (prime){
	          primes[ncounter] = ""+isPrime;
	          ncounter++;
	        } 
	        isPrime++;
	       }
		 
		  printAnaPalinNums(primes);
	  }
	  
	  /**
	   * Method to check Prime number
	   * @param num
	   * @return
	   */
	  public static boolean checkPrime(int num)
	  {
		  int i;
		  for(i=2 ; i<num ;i++)
		  {
			  if(num%i==0)
				  return false;
		  }
		  
		  return true;
	  }
	  
	  /**
	   * Method to check  Print numbers which are Prime , Palindrome and Anagram
	   * @param st
	   */
		
	 public static void printAnaPalinNums(String[] st)
	 {
		 boolean flag = false;
		 for(int i=0 ; i<st.length-1 ; i++)
		 {
			 for(int j=i+1 ; j<st.length ; j++)
			 {
				 if(checkAnagrams(st[i],st[j]) && checkPalindrome(st[i],st[j]))
				 {
					 System.out.println("["+st[i]+","+st[j]+"]");
					 flag = true;
					 
				 }
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println("not found");
		 }
	 }
	  /**
	   * Method to check palindrome
	   * @param st1
	   * @param st2
	   * @return
	   */
	 public static boolean checkPalindrome(String st1, String st2)
		{
		 int length1 = st1.length();
			int length2 = st2.length();
			
			if(length1 != length2)
				return false;
			
			int length = length1;
			
			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();
			int length3 = length-1;
			 if(length%2 != 0)
			 {
				 if(ch1[(length/2)] == ch2[(length/2)])
						 {
					       for(int i=0 ; i<length ; i++)
					       {
					    	   if(ch1[i] == ch2[length3--])
					    		   return true;
					       }
						 }
			 }
				 else
				      {
					 for(int i=0 ; i<length ; i++)
				       {
				    	   if(ch1[i] == ch2[length3--])
				    		   return true;
				       }
					 
				      }
				 
				return false;
				
		}
	 
	 /**
	  * Method to check Anagram when your string is number type
	  * @param st1
	  * @param st2
	  * @return
	  */
	 
	 public static boolean checkAnagrams(String st1 , String st2)
		{
			st1=sort(st1);
			st2=sort(st2);
			
			boolean t=check(st1,st2);
			if(t==true)
			{
			 return true;
	     	}
			 else
				 return false;
		}
	    
		/**
		 * Method to sort a string	
		 * @param s
		 * @return
		 */
		static String sort(String s)
		{
		 char ch[]=s.toCharArray();
		 for(int i=0;i<s.length();i++)
		 {
		   for (int j =i+1;j<ch.length; j++)
		    {
			 if(ch[i]>ch[j])
		      {
		       char t=ch[i];
		       ch[i]=ch[j];
		       ch[j]=t;
		      }
		    }
		 }
		  String s1=new String(ch);
		  return s1;
		}
		
		/**
		 * Method to check palindrome
		 * @param s1
		 * @param s2
		 * @return
		 */
		static boolean check(String s1, String s2)
		{
		  for(int i=0;i<s1.length();i++)
		   {
		    if(s1.charAt(i)!=s2.charAt(i))
		     {
		      return false;
		     }
		   }
		   return true;
		}


	 /**
	  * Method to check Anagram if your string is number type
	  * @param st1
	  * @param st2
	  * @return
	  */
	 public static boolean checkAnagramNumsxxxx(String st1 , String st2)
	 {
		 int[] charValueStore1 = new int[10];
			int[] charValueStore2 = new int[10];
			int i;
			boolean flag = false;
			for(i=0 ; i<st1.length() ; i++)
			{
				charValueStore1[(int)st1.charAt(i)-48]++;
				charValueStore2[(int)st1.charAt(i)-48]++;
				
			}
			
			for(i=0 ; i<charValueStore1.length;i++)
			{
				if(charValueStore1[i]== charValueStore2[i])
				{
			      flag = true;		
		     	}
			}
			if(flag)
			{
				return true;
			}
			else
			{
				return false;
			}
			
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}