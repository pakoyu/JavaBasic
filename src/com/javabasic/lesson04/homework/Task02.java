package com.javabasic.lesson04.homework;

public class Task02 {
    public static void main(String[] args) {
        int dogs = 24;
        int cats = 8;
        int portion = 50;
        int costs = 2;

        int foodForDogs = getFoodPreMonth(dogs, portion);
        int foodForCats = getFoodPreMonth(cats, portion);
        int costsPerMonth = getCostsPerMonth(portion, costs, foodForDogs, foodForCats);

        System.out.println("Food for dogs - " + foodForDogs);
        System.out.println("Food for cats - " + foodForCats);
        System.out.println("Costs food - " + costsPerMonth);

    }

    public static int getFoodPreMonth(int pets, int portion) {
        int dayInMonth = 30;
        int nutritionTimesDay = 3;
        return pets * portion * nutritionTimesDay * dayInMonth;
    }

    public static int getCostsPerMonth(int portion, int costs, int feedForDogs, int feedForCats) {
        return (feedForDogs + feedForCats) / portion * costs;
    }

}
