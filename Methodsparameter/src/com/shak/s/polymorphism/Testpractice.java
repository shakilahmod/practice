package com.shak.s.polymorphism;

public class Testpractice {
	public static void main(String[] args) {
		Practice a =new Practice();
		a.calculateArea();//without parameter
		a.calculateArea(5,3);//int length, int width
		a.calculateArea(15);//one parameter int length
		a.calculateArea(5.2,3.2);//double datatype with 2 parameters 
		
	}

}
