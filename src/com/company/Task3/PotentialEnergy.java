package com.company.Task3;

public class PotentialEnergy {
    private static final double g = 9.81;
    private double h;
    private double m;

    public PotentialEnergy() {
        this.h = 0;
        this.m = 0;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    //Метод, считающий потенциальную энергию тела
    public double calculatePotentialEnergy(){
        return this.m * this.h * PotentialEnergy.g;
    }
}
