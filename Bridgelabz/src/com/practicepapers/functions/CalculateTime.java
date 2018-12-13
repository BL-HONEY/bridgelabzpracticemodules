package com.practicepapers.functions;

import java.time.Instant;
import java.util.Scanner;

public class CalculateTime {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		long start = 0 , end = 0;
			
		while(true)
		{
			System.out.println("enter 0 to start and 1 to end");
		     byte b = sc.nextByte();
		     
		     if(b==0)
		     {
		    	 start = Instant.now().toEpochMilli();
		    	 flag = true;
		     }
		     if(b==1 && flag == true)
		     {
		    	 end = Instant.now().toEpochMilli();
		    	 break;
		     }
		}
		System.out.println((end-start)/1000+"seconds");
	}

}


