package com.practicepapers.functions;

import java.util.Scanner;

public class Username
{

	public static void main(String[] args) 
	{
      String st = "Hello <<username>>! how are you?";
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an Username");
      String userName = sc.next();
      
      addUserName(st,userName);

	}

	private static void addUserName(String st,String userName) 
	{
	  String neww  = st.substring(0, 6);
	  neww += userName;
	  neww += st.substring(18,st.length());
	  
	  System.out.println("Required String is "+ neww);
	  
	}

}



