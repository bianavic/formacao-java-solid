package org.edu.fabs.LSP.problem;

public class Main {
    public static void main(String[] args) {

        // por mais q 1 quadrado seja 1 retangulo,
        // ele modifica as propriedades de 1 retangulo


        // PROBLEMA:
        // resultado esperado: 50
        // resultado obtido: 25

        // o retangulo é, na verdade um quadrado
        // ao setar LARGURA == 5, substituiu ALTURA para 5

        // SOLUCOES:
        // 1- da classe retangulo, colocar getArea() na abstracao de 1 interface
        // 2- fazer quadrado nao estender do retangulo

        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area: " + retangulo.getArea());


    }

}