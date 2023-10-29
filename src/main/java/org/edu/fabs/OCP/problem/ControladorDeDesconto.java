package org.edu.fabs.OCP.problem;

public class ControladorDeDesconto {

    public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda) {
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }

    //  QUEBRA DO PRINCIPIO - ao inves de estender, estamos modificando

    // SITUACAO - precisa adicionar novo requisito, desconto para livros de acao.
    // cria classe DescontoLivroDeAcao
    // entao adicionar nesta classe adicionaLivroAcao() {}

}
