package ru.geekbrains.lesson6;

public class Dog extends Animal {
    int run;
    int swim;
    static int dogCount = 0;


    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        dogCount++;
    }

    public void dogInfo() {
        if (this.run <= 500) {
            System.out.println("Собака " + name + " пробежал " + this.run + " м");
        }
        if (this.run > 500) {
            System.out.println("Собаки не могут бегать больше 500м!");
        }
        if (this.swim > 10) {
            System.out.println("Собаки не могут плыть более 10м!");
        }
        if (this.swim <= 10) {
            System.out.println("Собака " + name + " проплыл " + this.swim + " м");
            }
        System.out.println("Общее количество собак " + dogCount);
        System.out.println("----------------");
        }
    }
