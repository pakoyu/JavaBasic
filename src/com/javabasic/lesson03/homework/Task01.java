package com.javabasic.lesson03.homework;

public class Task01 {
    public static void main(String[] args) {
        double pi = Math.PI;
        float radiusFirstSnowGlobe = 1.0f;
        float radiusSecondSnowGlobe = 0.5f;
        float radiusThirdSnowGlobe = 0.2f;
        float snowDensity = 0.7f;

        double massFirstSnowGlobe = snowDensity * ((double) 4 / 3 * pi * Math.pow(radiusFirstSnowGlobe, 3));
        double massSecondSnowGlobe = snowDensity * ((double) 4 / 3 * pi * Math.pow(radiusSecondSnowGlobe, 3));
        double massThirdSnowGlobe = snowDensity * ((double) 4 / 3 * pi * Math.pow(radiusThirdSnowGlobe, 3));
        double weightSnowman = massFirstSnowGlobe + massSecondSnowGlobe + massThirdSnowGlobe;

        System.out.println("Weight the Snowman: " + weightSnowman + " kg?");
    }
}
