package ru.geekbrains.lesson6;

public class Cat extends Animal {
    int run;
    int swim;
    static int catCount = 0;

    public Cat(String name, int run, int swim) {
      this.name = name;
      this.run = run;
      this.swim = swim;
      catCount++;
    }


    public void catInfo() {
        if (this.run <= 200) {
            System.out.println("Кот " + name + " пробежал " + this.run + " м");
        }
        if (this.run > 200) {
            System.out.println("Коты не могут бегать больше 200м!");
        }
            if (this.swim >= 1) {
                System.out.println("Коты не умеют плавать!");
            }
            System.out.println("Общее количество котов " + catCount);
            System.out.println("----------------");
        }


    }