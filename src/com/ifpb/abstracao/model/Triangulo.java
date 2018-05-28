package com.ifpb.abstracao.model;

public class Triangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        setArea(base*altura/2);
    }

    public int getBase(){
        return base;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
