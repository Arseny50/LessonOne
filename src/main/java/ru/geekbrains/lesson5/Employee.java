package ru.geekbrains.lesson5;

public class Employee {
    String name;
    String position;
    String email;
    long phoneNumber;
    double salary;
    int age;

    public Employee (String name, String position, String email, long phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        System.out.println("Employee:" + " " + name + " " + "position:" + " " + position + " " + "email:" + " " + email
                + " " + "telephone:" + " " + phoneNumber + " " + "salary:" + " " + salary + " " + "age:" + " " + age);
    }
}
