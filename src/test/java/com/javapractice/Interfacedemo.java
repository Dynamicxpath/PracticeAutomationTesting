package com.javapractice;
interface WaterBottle{
	String color="blue";
	void fillup();
	void modified();
}

public class Interfacedemo implements WaterBottle {

	public static void main(String[] args) {
		System.out.println(color);
		Interfacedemo ex= new Interfacedemo();
		ex.fillup();
		ex.modified();

	}
    
	public void fillup() {
		// TODO Auto-generated method stub
		System.out.println("the color of water is blue");
	}

	public void modified() {
		System.out.println("the color of water is green");
		
	}

}
