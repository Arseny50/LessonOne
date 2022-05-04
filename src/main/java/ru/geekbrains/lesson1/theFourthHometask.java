package ru.geekbrains.lesson1;

import java.util.Random;
import java.util.Scanner;

public class theFourthHometask {
    public static void main(String[] args) {
        String[][] field = ourField(3);
        printField(field);
        while (true) {
            humanTurns(field);
            printField(field);
            if  (isWinner(field, "X")) {
                System.out.println("Human wins");
                break;
            }
            if (isDraw(field)) {
                break;
            }
            aiTurns(field);
            printField(field);
           if (isWinner(field, "O")) {
               System.out.println("Ai wins");
               break;
           }
            if (isDraw(field)) {
                break;
            }
        }
    }

    //Создаем само поле
    public static String[][] ourField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    //Печать игрового поля
    public static void printField(String[][] field) {
        System.out.println("--------");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    //Ход человека
    public static void humanTurns(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                }
                else {
                    System.out.println("Тут занято");
                }
            }
            else {
                System.out.println("За пределами поля");
            }
        }
    }
    //Ход ии
    public static void aiTurns(String[][] field) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "O";
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                            1));
                    break;
                }
            }
        }
    }

    //Проверка победы
    public static  boolean isWinner(String[][] field, String turn) {
        if (
                (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn)) ||
                (field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn)) ||
                        (field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        }
        else if (
                (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn)) ||
                        (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        }
        else if (
                (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn))
        ) {
            return true;
        }
        else {
            return  false;
        }
    }

    //Если ничья
    public static boolean isDraw(String[][] field) {
        boolean isDraw = false;
        for (int i = 0; i < field.length; i ++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Draw");
        return true;
    }
}
