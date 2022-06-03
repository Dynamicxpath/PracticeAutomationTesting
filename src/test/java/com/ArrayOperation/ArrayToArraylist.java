package com.ArrayOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist {
////1.Method
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//          String [] arr = {"rahul","trishsa"
//		       ,"mayank","jyoti"};
//             List al= Arrays.asList(arr);
//           System.out.println(al);
	

 public static void main(String[]args)
{
	 String[] geeks = {"Rahul", "Utkarsh",
             "Shubham", "Neelam"};
			
			List<String> al =
            new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(al);
 
        // Adding some more values to the List.
        al.add("Shashank");
        al.add("Nishant");
 
        System.out.println("\n ArrayList After adding two" +
                           " more Geeks: ");
        System.out.println(al);

 }
}
 
