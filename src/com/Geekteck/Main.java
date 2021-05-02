package com.Geekteck;

import java.util.Random;

public class Main {
    // write your code here


    public static int generationRandomAge() {
        int minAge = 13;
        int maxAge = 71;
        int diff = maxAge - minAge;

        Random randomAge = new Random();
        int a = randomAge.nextInt(diff);
        return a + minAge;
    }

    public static void main(String[] args) {
        System.out.println(permission("Руслан", generationRandomAge(), generationRandomTemperature()));
        System.out.println(permission("Калыс", generationRandomAge(), generationRandomTemperature()));
        System.out.println(permission("Шерзад", generationRandomAge(), generationRandomTemperature()));
        System.out.println(permission("Бахтияр", generationRandomAge(), generationRandomTemperature()));
        System.out.println(permission("Тахир", generationRandomAge(), generationRandomTemperature()));
    }

    public static String permission(String name, int ageOfPerson, int temperature) {
        if (ageOfPerson >= 20 && ageOfPerson <= 45 && temperature > -20 && temperature <= 30) {
            return name + ", можно идти гулять";
        } else if (ageOfPerson < 20 && temperature >= 0 && temperature < 28) {
            return name + ", можно идти гулять";
        } else if (ageOfPerson > 45 && temperature > -10 && temperature < 25) {
            return name + ", можно идти гулять";
        }
        return name + ", Cиди дома";
    }

    public static int generationRandomTemperature() {
        int minTemp = -30;
        int maxTemp = 40;
        int diff = maxTemp - minTemp;

        Random randomTemp = new Random();
        int t = randomTemp.nextInt(diff);
        return t + minTemp;
    }
}

