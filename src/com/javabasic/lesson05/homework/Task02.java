package com.javabasic.lesson05.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {

	static final int MAX_HEIGHT_BAG = 40;
	static final int MAX_WIDTH_BAG = 55;
	static final int MAX_DEPTH_BAG = 20;

	static final int MAX_HEIGHT_CASE = 53;
	static final int MAX_WIDTH_CASE = 40;
	static final int MAX_DEPTH_CASE = 22;

	static Integer heightBaggage;
	static Integer widthBaggage;
	static Integer depthBaggage;

	public static void main(String[] args) throws IOException {
		setSizeBaggage();
		getTypeBaggage();
	}

	static void getTypeBaggage() {
		if ((verifySizeBaggage(MAX_HEIGHT_BAG, MAX_WIDTH_BAG, MAX_DEPTH_BAG))
				| (verifySizeBaggage(MAX_HEIGHT_CASE, MAX_WIDTH_CASE, MAX_DEPTH_CASE))) {
			System.out.println("This baggage meets the standards of hand luggage.");
		} else {
			System.out.println("This baggage does not fit the standards of hand luggage.");
		}
	}

	static void setSizeBaggage() throws IOException {
		heightBaggage = getSize("Enter the height baggage: ");
		widthBaggage = getSize("Enter the width baggage: ");
		depthBaggage = getSize("Enter the depth baggage: ");
	}

	static Integer getSize(String text) throws IOException {
		System.out.print(text);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(reader.readLine());
	}

	static boolean verifySizeBaggage(int maxHeight, int maxWidth, int maxDepth) {
		return heightBaggage <= maxHeight & widthBaggage <= maxWidth & depthBaggage <= maxDepth;
	}
}
