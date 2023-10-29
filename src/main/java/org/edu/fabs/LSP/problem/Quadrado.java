package org.edu.fabs.LSP.problem;

public class Quadrado extends Retangulo {

    // ao setar tanto largura qto altura
    // MODIFICA os 2 atributos
    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }

    @Override
    public void setLargura(double largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

}
