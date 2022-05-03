package ru.geekbrains.lesson1;

public class TheThirdHometask {
    public static void main(String[] args) {
        theFirstObjective();
        theSecondObjective();
        theThirdObjective();
        theFourthObjective();
        theFifthObjective();
    }
    public static void theFirstObjective() {
        int[] numbers = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 1 ) {
                System.out.println(numbers[i] + 1);
            }
            else {
                System.out.println(numbers[i] -1 );
            }
        }
        }

    public static void theSecondObjective(){
        int[] anotherNumbers = new int [100];
        anotherNumbers[0] = 0;
        for (int i = 1; i < anotherNumbers.length; i++) {
            System.out.println(i);
        }

    }
    public static void theThirdObjective(){
        int[] diffNumbers = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < diffNumbers.length; i++) {
            if (diffNumbers[i] < 6) {
                System.out.println( diffNumbers[i] * 2);
            }
        }

    }
    public static void theFourthObjective() {
        int[][] cubeArr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    System.out.println(cubeArr[i][j] + 1);
                }
            }
        }
    }
    public static void theFifthObjective(){
    }
}
