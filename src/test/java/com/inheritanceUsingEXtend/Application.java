package com.inheritanceUsingEXtend;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      chef cf = new chef();
      cf.makespecialDish();
      Chinessechef chf= new Chinessechef();
      chf.makespecialDish();
      ItalianChef itchef= new ItalianChef();
      itchef.makespecialDish();
	}

}
