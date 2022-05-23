package ru.geekbrains.lesson6;

public class Animal {
    String name;
    int run;
    int swim;
    static int animalCount = 0;

    public Animal() {
    }
    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        animalCount++;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name + " пробежало " + run + ", проплыло " + swim + " м ");
        System.out.println("Общее количество животных " + animalCount);
        System.out.println("----------------");
    }
}