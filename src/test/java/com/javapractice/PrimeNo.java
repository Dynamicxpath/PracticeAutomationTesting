package com.javapractice;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int temp=0,n=7;
       for(int i=2;i<=6;i++)
       {
    		   if(n%i==0)
    		   {
    			   temp=temp+1;
    		   }
    	   }
    	   if(temp==0)
    	   {
    		   System.out.println(n +" " +" is a prime number");
    	   }
    	   else
    	   {
    		   System.out.println(n+" "+ "is not a prime no");
    	   }
       }
	}


