package com.javapractice;

public class EvenAndOddNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  [] a = {11,12,13,14,15};
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.print("The even nos are:");
				System.out.println(value);
			}
		}
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.print("The odd nos are:");
				System.out.println(value);
			}
		}

	}

}
