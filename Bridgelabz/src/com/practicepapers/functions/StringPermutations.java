package com.practicepapers.functions;

import com.resources.utility.Utility;

public class StringPermutations 
{
	public static void main(String[] args) 
	{
      System.out.println("Enter a Word for which you want to find all possible permutations: ");
      String st = Utility.getStringAsWord();
      
      //Function call to find all possible permutations
      Utility.findPermutations(st,0,st.length()-1);
      
      
	}
}
