package com.ifpb.abstracao.model;

public abstract class FiguraGeometrica {
    private double area;

    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
