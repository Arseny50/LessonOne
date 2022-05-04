package ru.geekbrains.lesson1;

public class TheThirdHometask {
    public static void main(String[] args) {
        int[] arrSix = {1,3,5,7,9,11};
        theFirstObjective();
        theSecondObjective();
        theThirdObjective();
        theFourthObjective();
        theFifthObjective(7, 4);
        theSixthObjective(arrSix);
        //forExample();
    }
    public static void theFirstObjective() {
        int[] numbers = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 ) {
                numbers[i] = 1;
            }
            else {
                numbers[i] = 0;
            }
            System.out.print(numbers[i] + " ");
        }
        }

    public static void theSecondObjective(){
        int[] anotherNumbers = new int [100];
        for (int i = 0; i < anotherNumbers.length; i++) {
            anotherNumbers[i] = i +1;
            System.out.println(anotherNumbers[i] + " ");
        }

    }
    public static void theThirdObjective(){
        int[] diffNumbers = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < diffNumbers.length; i++) {
            if (diffNumbers[i] < 6) {
                diffNumbers[i] = diffNumbers[i] * 2;
            }
            System.out.println(diffNumbers[i] + " ");
        }

    }
    public static void theFourthObjective() {
        int[][] cubeArr = { {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6} };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    cubeArr[i][j] = 1;
                }
                System.out.print(cubeArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void theFifthObjective(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
    public static void theSixthObjective( int[] arr) {
    int max = arr[0];
    int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
            for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
            System.out.println(max);
            System.out.println(min);
}
//Просто попробовал задать массивы по-разному.
/*public static void forExample() {
    int[] arrSix = {1,3,5,7,9,11};
    int max = arrSix[0];
    int min = arrSix[0];
    for (int i = 0; i <arrSix.length; i++) {
        if (arrSix[i] > max) {
            max = arrSix[i];
        }
    }
    for (int i = 0; i < arrSix.length; i++) {
        if (arrSix[i] < min) {
            min = arrSix[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
} */
}
