package org.edu.fabs.LSP.solution;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5d);
        retangulo.setLargura(10d);

        System.out.println("Area: " + retangulo.getArea());
    }

}