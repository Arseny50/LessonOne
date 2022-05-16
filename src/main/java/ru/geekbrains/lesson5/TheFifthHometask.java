package ru.geekbrains.lesson5;

public class TheFifthHometask {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Driver", "Vanya@mail.ru",
                89991234567L, 40000, 25);
        Employee employee2 = new Employee("Leonid", "Storekeeper", "Lenya@mail.ru",
                89991234568L, 60000, 45);
        Employee employee3 = new Employee("Petr", "General Manager", "Petr@mail.ru",
                89991234569L, 200000, 57);
        Employee employee4 = new Employee("Svetlana", "Accountant", "Sveta@mail.ru",
                89991234570L, 90000, 48);
        Employee employee5 = new Employee("Darya", "Secretary", "Dasha@mail.ru",
                89991234571L, 35000, 21);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
                if (employees[i].age >=40)
                    System.out.println("Сотрудник" + " "+ employees[i].name + " " + "старше сорока лет, его возраст:"
                            + " " + employees[i].age + " " + "лет");
                }
            }
        }