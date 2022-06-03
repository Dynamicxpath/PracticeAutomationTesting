package com.constructors;

public class GettersAndSetters {
	
	private String name;
	int age;
	int id;
	public GettersAndSetters(String name,int age,int id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setId(int id)
	{
		this.id=id;
	}

	public static void main(String[] args) {
		
		GettersAndSetters gas= new GettersAndSetters("girija",30,11);
//		gas.name="john";
	    System.out.println(gas.getName());
		gas.setName("shree");
		System.out.println(gas.getName());
	}

}
