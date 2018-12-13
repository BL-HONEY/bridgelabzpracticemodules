package com.practicepapers.algorithms;

import com.resources.utility.Utility;

public class Anagram
{
	public static void main(String[] args) 
	{
		System.out.println("Enter First String: ");
		String st1 = Utility.getStringAsWord();
		
		System.out.println("Enter Second String: ");
		String st2 = Utility.getStringAsWord();
		
		if(Utility.checkAnagram(st1,st2))
		{
			System.out.println("Anagram found");
		}	
			else
			{
				System.out.println("Not an Anagram");
			}
	}

}
