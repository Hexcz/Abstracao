package com.ifpb.abstracao.view;

import com.ifpb.abstracao.model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        byte escolha = 0;
        int i = 0;
        while (escolha < 1 || escolha > 3){
            Scanner read1 = new Scanner(System.in);
            System.out.println("Escolha qual tipo de figura geométrica você deseja (| 1 > Quadrado | 2 > Triângulo | 3 > Círculo |): ");
            escolha = read1.nextByte();
        }
        switch (escolha){
            case 1:
                Scanner read2 = new Scanner(System.in);
                System.out.println("Digite o valor do lado do quadrado: ");
                Quadrado quadrado1 = new Quadrado(read2.nextInt());
                quadrado1.calcularArea();
                System.out.println("A área do quadrado com o valor fornecido é: "+quadrado1.getArea()+".");
                break;
            case 2:
                Scanner read3 = new Scanner(System.in);
                System.out.println("Digite o valor da base do triângulo: ");
                int base = read3.nextInt();
                System.out.println("Digite o valor da altura do triângulo: ");
                int altura = read3.nextInt();
                Triangulo triangulo1 = new Triangulo(base, altura);
                triangulo1.calcularArea();
                System.out.println("A área do triângulo com os valores fornecidos é: "+triangulo1.getArea()+".");
                break;
            case 3:
                Scanner read5 = new Scanner(System.in);
                System.out.println("Digite o valor do raio do círculo: ");
                Circulo circulo1 = new Circulo(read5.nextInt());
                circulo1.calcularArea();
                System.out.println("A área do círculo com o valor fornecido é: "+circulo1.getArea()+".");
                break;
        }
    }
}
