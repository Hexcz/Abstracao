package com.ifpb.abstracao.model;

public class Circulo extends FiguraGeometrica {
    private int raio;
    private final double pi = 3.14;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        setArea(pi*Math.pow(raio, 2));
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
