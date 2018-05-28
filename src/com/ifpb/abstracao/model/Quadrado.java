package com.ifpb.abstracao.model;

public class Quadrado extends FiguraGeometrica {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        setArea(lado*lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
