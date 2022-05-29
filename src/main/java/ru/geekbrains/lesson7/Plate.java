package ru.geekbrains.lesson7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int f) {
        food -= f;
    }

    public void increaseFood(int a) {
        food += a;
    }

    public void info() {
        if (food <= 0) {
            System.out.println("Еды в тарелке недостаточно, коты не могут поесть!");
        } else {
            System.out.println("Количество еды в миске: " + food);
        }
    }
}
