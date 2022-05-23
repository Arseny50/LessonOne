package ru.geekbrains.lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 400, 10);
        Dog dog1 = new Dog("Барбос", 300, 7);
        Dog dog2 = new Dog("Рекс", 560, 30);
        Dog dog3 = new Dog("Мухтар", 499, 3);
        Cat cat = new Cat("Барсик", 200, 5);
        Cat cat1 = new Cat("Рыжик", 500, 4);
        Cat cat2 = new Cat("Мурзик", 27, 1);
        Animal animal = new Animal("Хомяк", 300, 1);
        Animal animal1 = new Animal("Волк", 700, 40);
        dog.dogInfo();
        dog1.dogInfo();
        dog2.dogInfo();
        dog3.dogInfo();
        cat.catInfo();
        cat1.catInfo();
        cat2.catInfo();
        animal.animalInfo();
        animal1.animalInfo();
    }
}


