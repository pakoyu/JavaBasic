package com.javabasic.lesson03.classwork;

public class TypeCasting {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println("byte : " + b);

		short sh = b;
		System.out.println("short : " + sh);

		int i = 2_002_000;
		System.out.println("int : " + i);

		b = (byte) i;
		System.out.println("byte : " + b);

		b = 127;
		b = (byte) (b + 1);
		System.out.println("byte : " + b);
		float f = 342.42424242F;
		byte floatToByte  = (byte) f;
		System.out.println("floatToByte : " + floatToByte);

	}
}
