package com.Abstractclass;

abstract class Dog{
	public abstract void poop();
	public void bark()
	{
		System.out.println("bhow bhow");
	}
}
class Chihuua extends Dog{

	@Override
	public void poop() {
		System.out.println("dog wants to poop");
	}
}
	
 public class Abstract {

	public static void main (String [] args) {
		// TODO Auto-generated method stub
     Chihuua ch = new Chihuua();
     ch.bark();
     ch.poop();

	}

}


