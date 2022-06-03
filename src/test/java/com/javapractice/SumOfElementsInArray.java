package com.javapractice;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int  [] a = {11,12,13,14,15};
		for(int value:a)
		{
			sum=sum+ value;
		}
		System.out.println("The sum of all elements in an array is :" +sum);
	}

}
