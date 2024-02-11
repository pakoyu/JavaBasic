package com.javabasic.lesson08.homework;

public class Task01 {

    public static final int minAgePlayers = 18;
    public static final int maxAgePlayers = 45;
    public static final int numberOfPlayers = 11;

    public static void main(String[] args) {

        Integer[][] teams = new Integer[][]{
                new Integer[numberOfPlayers],
                new Integer[numberOfPlayers]
        };

        setAgePlayers(teams, minAgePlayers, maxAgePlayers);

        printAgePlayers(teams);

        printMaxAverageAge(teams);

    }

    public static void printMaxAverageAge(Integer[][] teams) {
        Integer[] averageAgeTeams = new Integer[teams.length];

        for (int a = 0; a < teams.length; a++) {
            averageAgeTeams[a] = averageValueArray(teams[a]);
        }
        if (!isEqualValuesArray(averageAgeTeams)) {
            for (int i = 0; i < averageAgeTeams.length; i++) {
                if (averageAgeTeams[i].equals(maxValueArray(averageAgeTeams))) {
                    System.out.println(
                            "Team " + (i + 1) + " has max age of players - " +
                                    averageAgeTeams[i] + " years");
                }
            }
        } else {
            System.out.println("Average age of players all teams is the same");
        }
    }


    public static void printAgePlayers(Integer[][] teams) {
        for (int i = 0; i < teams.length; i++) {
            System.out.print("Age of the players of the team " + (i + 1) + " - ");
            printArray(teams[i]);
        }
    }

    public static void setAgePlayers(Integer[][] teams, int min, int max) {
        for (Integer[] array : teams) {
            for (int i = 0; i < array.length; i++) {
                array[i] = randomInt(min, max);
            }
        }
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(";");
            }
        }
        System.out.println();
    }

    public static int sumValuesArray(Integer[] array) {
        int sum = 0;
        for (Integer integer : array) {
            sum += integer;
        }
        return sum;
    }

    public static Integer averageValueArray(Integer[] array) {
        return sumValuesArray(array) / array.length;
    }

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static Integer maxValueArray(Integer[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static Boolean isEqualValuesArray(Integer[] array) {
        int val = array[0];
        for (int i = 0; i < array.length; i++) {
            if (val != array[i]) {
                return false;
            }
        }
        return true;
    }
}
