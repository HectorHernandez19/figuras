package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public double getArea(){
        return radio*radio*Math.PI;
    }

    public void draw(){
        System.out.println("Circulo");
    }

}
