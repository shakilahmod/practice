package com.shak.methods;

public class Testemployee {
public static void main(String[] args) {
	employee john = new employee();
    john.salary = 1000;
	john.bonus =1000;
	john.calculatesalary ();

	
	employee david = new employee();
	david.salary= 1200;
	david.bonus=1100;
	david.calculatesalary();
	System.out.println(john.calculatesalary() + david.calculatesalary());		
}
}
