package com.javabasic.lesson04.homework;

public class Task01 {
    public static void main(String[] args) {
        printAirplaneInfo("Jet", "F-22 Raptor");
        System.out.println();
        printAirplaneInfo("Airliner", "Aerobus 737", 120);
        System.out.println();
        printAirplaneInfo("Airliner", "Boeing 777", 180, 28);

    }

    public static void printAirplaneInfo(String name, String type) {
        System.out.print("Name aircraft - " + name + ". ");
        System.out.print("Type aircraft - " + type + ". ");
    }

    public static void printAirplaneInfo(String name, String type, int seatsEconomy) {
        printAirplaneInfo(name, type);
        System.out.print("Economy seats  - " + seatsEconomy + ". ");
    }

    public static void printAirplaneInfo(String name, String type, int seatsEconomy, int seatsBusiness) {
        printAirplaneInfo(name, type, seatsEconomy);
        System.out.print("Business-class seats  - " + seatsBusiness + ". ");
    }
}
