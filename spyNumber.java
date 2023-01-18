package com.java.practice;

import java.util.Scanner;

public class spyNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Spy Number Program");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int num=sc.nextInt();
	      int temp=num;
	      int srev=0;
	      while(num>0)
	      {
	    	  int rem=num%10;
	    	  srev=srev+rem;
	    	  num/=10;
	      }
	       num=temp;
	      int mrev=1;
	      while(num>0)
	      {
	    	  int rem=num%10;
	    	  mrev=mrev*rem;
	    	  num/=10;
	      }
	      if(srev==mrev)
	      {
	    	  System.out.println(temp +" is Spy Number");
	      }
	      else
	      {
	    	  System.out.println(temp +" is not Spy Number");
	      }
	}

}
