package ru.geekbrains.lesson1;

public class TheSecondHometask {
    public static void main(String[] args) {
        question();
        theFirstTask();
        theSecondTask();
        theThirdTask();
        theFourthTask();
    }

    //Можно ли сделать первую задачу подобным образом?
    public static void question() {
        int a = 3;
        int b = 16;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean theFirstTask() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void theSecondTask() {
        int x = 12;
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean theThirdTask() {
        int x = 1;
        if (x < 0) {
            return true;
        }
        return false;
    }
    public static void theFourthTask() {
        for (int a = 0; a < 3; a++ ) {
            for (int b = 0; b < 1; b++ ) {
                System.out.println("This string is for example");
            }
            System.out.println();
        }
    }
}