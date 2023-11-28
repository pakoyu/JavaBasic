package com.javabasic.lesson03.homework;

public class Task01 {
    public static void main(String[] args) {
        double pi = Math.PI;
        double radiusFirstSnowGlobe = 1.0;
        double radiusSecondSnowGlobe = 0.5;
        double radiusThirdSnowGlobe = 0.2;
        double snowDensity = 0.7;

        double massFirstSnowGlobe = snowDensity * 4 / (3 * pi * Math.pow(radiusFirstSnowGlobe, 3));
        double massSecondSnowGlobe = snowDensity * 4 / (3 * pi * Math.pow(radiusSecondSnowGlobe, 3));
        double massThirdSnowGlobe = snowDensity * 4 / (3 * pi * Math.pow(radiusThirdSnowGlobe, 3));
        double weightSnowman = massFirstSnowGlobe + massSecondSnowGlobe + massThirdSnowGlobe;

        System.out.println("Weight the Snowman: " + weightSnowman);
    }
}