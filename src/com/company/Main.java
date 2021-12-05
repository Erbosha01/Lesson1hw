package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String appleBananaPear;
        final int NUM = 15;
        String word = "Cool";
        appleBananaPear = "15Cool";
        System.out.println(appleBananaPear + NUM + word);

        // Условная конструкция if

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }


        // ДЗ на сообразительность


        System.out.println("Введите ваше имя.");
        Scanner name = new Scanner(System.in);
        System.out.println("Hello " + name.nextLine());
    }
}
