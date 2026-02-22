package org.tns.acc.c2tc.core_java.java_basics;

public class Variablesdemo 
{
	int a = 10;
	void print() 
	{
		String msg = "hello";
		System.out.println(msg);
	}
	static String message = "hello students";

	public static void main(String[] args) {
		Variablesdemo obj = new Variablesdemo();
		System.out.println("the value of a :"+ obj.a);
		obj.print();
		System.out.print(message);
	}

}
