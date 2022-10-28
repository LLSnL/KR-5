package com.company.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstParam, secondParam;
        System.out.println("Введите длину первой стороны треугольника:");
        firstParam = sc.nextDouble();
        System.out.println("Введите длину второй стороны треугольника:");
        secondParam = sc.nextDouble();
        RightTriangle triangle = new RightTriangle(firstParam, secondParam);
        //Вывод длины гипотенузы
        System.out.println("Длина гипотенузы = " + triangle.getHypotenuse());
    }
}
