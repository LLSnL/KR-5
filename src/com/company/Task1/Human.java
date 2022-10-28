package com.company.Task1;

public class Human {
    private static int currentYear = 2022;
    private String name;
    private String surname;
    private int yearOfBirth;

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    //Метод, который выводить в консоль фамилию, имя и возраст человека.
    public void getPersonData() {
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.surname);
        System.out.println("Возраст: " + getAge());
    }

    //Метод, считающий возраст
    public int getAge() {
        return currentYear - this.yearOfBirth;
    }
}
