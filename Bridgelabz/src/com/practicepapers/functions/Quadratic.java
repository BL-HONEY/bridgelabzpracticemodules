package com.practicepapers.functions;

import com.resources.utility.Utility;

/**
 * 
 * @author honey
 *
 */

public class Quadratic 
{

	public static void main(String[] args)
	{
	  System.out.println("An Quadrstic Equation is of form ax2 + bx + c (where '`' represents power means x * x)");	
      System.out.println("Enter values for a ,b, c");
      int a = Utility.getInt();
      int b = Utility.getInt();
      int c = Utility.getInt();
      
      Utility.representQuadratic(a,b,c);
      
      int[] roots = Utility.findRoots(a, b, c);
      
      for(int i=0 ; i<2 ; i++)
    	  System.out.println("roots are "+ roots[i]);
      
	}

}
