package org.edu.fabs.OCP.solution;

public class ControladorDeDesconto {

    // agora trabalhamos apenas com um metodo,
    // recebemos a abstracao DescontoLivro como parametro e
    // nao a implementacao em si das classes
    public void adicionaDescontoLivro(DescontoLivro descontoLivro) {
        descontoLivro.valorDesconto();
    }

}
