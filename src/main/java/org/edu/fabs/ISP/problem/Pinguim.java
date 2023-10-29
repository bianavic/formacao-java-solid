package org.edu.fabs.ISP.problem;

public class Pinguim implements Ave {

    @Override
    public void bicar() {

    }

    @Override
    public void chocarOvos() {

    }

    // VIOLACAO PRINCIPIO
    // solucao é segregar a interface pq ela nao atende a todas as aves
    @Override
    public void voar() {
        // PINGUIM NAO VOA
    }

}
