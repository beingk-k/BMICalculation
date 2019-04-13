package com.e.bmicalculation;

public class bmiarithmetic {

    private double height, weight, heightM;

    public bmiarithmetic(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI (){
        heightM = height/100;
        return weight/(heightM*heightM);
    }
}
