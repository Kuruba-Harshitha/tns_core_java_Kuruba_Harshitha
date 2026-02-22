package org.tns.acc.c2tc.core_java.interfacedemo;

class Vehicle {
    final void speed() {
        System.out.println("The speed of the vehicle is 40km/hr");
    }
}

class bike extends Vehicle {
    void drive() {
        speed();
    }
}
public class Final_method {
	public static void main(String[] args) {
		 bike b = new bike();   
	        b.drive();     

	}


}
