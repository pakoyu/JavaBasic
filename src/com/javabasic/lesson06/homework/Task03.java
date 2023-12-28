package com.javabasic.lesson06.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введіть кількість яблук: ");
        int apples = Integer.parseInt(reader.readLine());
		
		int jarsForFiveAppels = apples / 5;
		int jarsForTreeAppels = (apples - jarsForFiveAppels * 5) / 3;
		int jarsForOneAppels = (apples - jarsForFiveAppels * 5) - jarsForTreeAppels * 3;
		
		System.out.println("Великих банок - " + jarsForFiveAppels);
		System.out.println("Середніх банок - " + jarsForTreeAppels);
		System.out.println("Маленьких банок - " + jarsForOneAppels);
	}
}