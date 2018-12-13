package com.practicepapers.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BinarySearch 
{

	public static void main(String[] args)throws Exception
	{
		 File file = new File("/home/honey/abc.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		  
		  System.out.println(st);
		  
//		  String snw = "hi @ honey";
//		  String[] sn = snw.split("@");
//		  for(int i=0 ; i< sn.length;i++)
//			  System.out.println(sn[i]);
	}

}
