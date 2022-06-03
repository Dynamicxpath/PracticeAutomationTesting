package com.javapractice;

public class MissingNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {1,2,3,5,6};
       int sum=0;
      int len=a.length;
      int expect_len=len+1;
      int Expect_sum= expect_len*(expect_len+1)/2;
      for(int value:a)
      {
    	  sum=sum+value;
      }
      System.out.println("missing No is:"+ (Expect_sum-sum));
	}

}
