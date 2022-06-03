package com.constructors;

public class ConstructorDetails {
	
	  String name;
	  int age;
	

	public static void main(String[] args) {
		ConstructorDetails cd = new ConstructorDetails();
		cd.name= "Girija";
		cd.age= 10;
		cd.printDetails();
	}

		
		public void printDetails()
		{
			System.out.println(name+ ","+ age);
		}
	}


