package com.javabasic.lesson02;

public class Task01 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();

		int c;
		c = a;
		a = b;
		b = c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
