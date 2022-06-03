package com.javapractice;

import java.util.Scanner;

public class SumOfNnaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a no:");
                int num= sc.nextInt();
                int sum=0;
                while(num!=0)
                {
                	sum=sum+num;
                	num--;
                }
                System.out.println("sum of n natural num:" +sum);
	}

}
