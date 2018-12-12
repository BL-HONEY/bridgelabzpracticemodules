package com.practicepapers.functions;

/**
 * Program don't work for Eclipse
 * @author honey
 *
 */
public class Distance 
{

	public static void main(String[] args) 
	{
		  int x = Integer.parseInt(args[0]);
		  int y = Integer.parseInt(args[1]);

		  double distance = Math.pow((x*x + y*y),0.5);
		  System.out.println("Distance: "+ (int)distance);	
		}
	}


