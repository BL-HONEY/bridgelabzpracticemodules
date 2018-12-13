package com.practicepapers.functions;

//Not works in Eclipse

class CommandLinePower     
{
	public static void main(String[] args)
	 {
	    //System.out.println("Entered Power value is ",args[0]);
       int n = Integer.parseInt(args[0]);
      
       int i = 0;                // count from 0 to N
      int powerOfTwo = 1;       // the ith power of two

      // repeat until i equals n
      while (i <= n)
       {
          System.out.println(i + " " + powerOfTwo);   // print out the power of two
          powerOfTwo = 2 * powerOfTwo;                // double to get the next one
          i = i + 1;
      }
    //    if(N <= 31)
    //    {
	     //   System.out.println("Required Power is " +calPower(2,N));
	     // }  	

	 }

}	 

//	 public static int calPower(int num ,int N)
//	 {
//      int power = 1;

//      while(N != 0)
//      {
//      	 power *= num; 
//      	 N--;
//      }

//      return power;
//	 }
//}


