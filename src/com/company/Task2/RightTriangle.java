package com.company.Task2;

public class RightTriangle {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;

    //Метод,считающий длину гипотенузы
    public double calculateHypotenuse() {
        return Math.pow(Math.pow(cathet1, 2) + Math.pow(cathet2, 2), 0.5);
    }

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        this.hypotenuse = this.calculateHypotenuse();
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}
