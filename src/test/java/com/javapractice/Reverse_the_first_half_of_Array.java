package com.javapractice;

public class Reverse_the_first_half_of_Array {

	public static void main(String[] args) {
		
		int[] arr= {10,2,5,4,11,13,8,3};



        int len=arr.length;

       System.out.println(len);

        for(int i=0; i<len/4;i++)

        {

            int t = arr[i]; 

            arr[i] = arr[len/2 - i - 1]; 

            arr[len/2 - i - 1] = t; 

        }



        for(int j=0; j<len; j++)

        {

            System.out.println(arr[j]);

        }
	}

}
