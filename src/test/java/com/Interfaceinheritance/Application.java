package com.Interfaceinheritance;

public class Application {

	public static void main(String[] args) {
		
		AnimalInterface[] arr = { new Dog(),
				new cow(),
				new Cat(),
		};
		for(int i=0; i<arr.length;i++)
		{
			arr[i].eat();
			arr[i].speak();
		}
				
				
		}

	}


