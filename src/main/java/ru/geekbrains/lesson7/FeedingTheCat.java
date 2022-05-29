package ru.geekbrains.lesson7;

import java.util.Scanner;

public class FeedingTheCat {
    public static void main(String[] args) {
      int action;
      Cat[] allCats = new Cat[3];
      allCats[0] = new Cat("Пушок", 44, false);
      allCats[1] = new Cat("Буся", 65, false);
      allCats[2] = new Cat("Усатый", 57,false);

      Plate plate = new Plate(300);
      plate.info();
      for (int i = 0; i < allCats.length; i++) {
          if (allCats[i].satiety == false && allCats[i].appetite < plate.food) {
              allCats[i].eat(plate);
              allCats[i].satiety = true;
              System.out.println("Кот " + allCats[i].name + " покушал");
          }
          else {
              System.out.println("Кот " + allCats[i].name + " не покушал");
          }
      }

      plate.info();
      System.out.println("Сколько корма добавить в миску?");
      Scanner sc = new Scanner(System.in);
      action = sc.nextInt();
      plate.increaseFood(action);
      plate.info();

    }
}
