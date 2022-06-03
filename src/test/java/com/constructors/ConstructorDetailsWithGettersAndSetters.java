package com.constructors;

public class ConstructorDetailsWithGettersAndSetters {
	
	  String name;
	  int age;
	

	public static void main(String[] args) {
		ConstructorDetailsWithGettersAndSetters cd = new ConstructorDetailsWithGettersAndSetters();
		cd.name= "Girija";
		cd.age= 10;
		System.out.println(cd.getAge());
		System.out.println(cd.getName());
		cd.printDetails();
	}
public void setName(String name)
{
	this.name=name;
}
public void setAge(int age)
{
	this.age=age;
}
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
		public void printDetails()
		{
			System.out.println(name+ ","+ age);
		}
	}


