package com.practicepapers.functions;

import com.resources.utility.Utility;

public class Gambler
{

	public static void main(String[] args) 
	{
	  System.out.println("Enter Gambler's name: ");
	  String name = Utility.getStringAsWord();
	  
      System.out.println("Enter the amount you want to have in your Stack");
      int stack = Utility.getInt();
      
      System.out.println("Enter your target stack");
      int target = Utility.getInt();
      
      System.out.println("Enter your fixed bet amount");
      int bet = Utility.getInt();
      
      System.out.println("Hello "+name);
      System.out.println("Your Initial Data: ");
      System.out.println("Stack: "+stack);
      System.out.println("Target: "+target);
      System.out.println("Fixed Bet Amount: "+bet);
      
      int wins = Utility.decider(stack,target,bet);
      
      System.out.println("Total wins: "+ wins);
	}

}
