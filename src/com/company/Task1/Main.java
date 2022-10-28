package com.company.Task1;

public class Main {
    public static void main(String[] args) {
        Human testHuman = new Human("Виталий", "Понаморёв", 1978);
        //Примение метода, выводящего всю информацию о человеке
        testHuman.getPersonData();
        //Применение метода, считающего возраст
        int personAge = testHuman.getAge();
        System.out.println("Полученный возраст: " + personAge);
    }
}