package com.company.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mass, height;
        PotentialEnergy p = new PotentialEnergy();
        Scanner sc = new Scanner(System.in);
        //Получение массы
        System.out.println("Введите массу тела:");
        mass = sc.nextDouble();
        p.setM(mass);
        //Получение высоты
        System.out.println("Введите высоту, на которой находится тело:");
        height = sc.nextDouble();
        p.setH(height);
        //Вывод на экран потенциальной энергии
        System.out.println("Потенциальная энергия тела: " + p.calculatePotentialEnergy());
    }
}
