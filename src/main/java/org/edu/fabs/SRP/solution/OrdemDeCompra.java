package org.edu.fabs.SRP.solution;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {

    //  QUEBRA DO PRINCIPIO - muitas responsabilidades diferentes

    // alem da classe lidar com a ordem de compras em si
    // busca ordem de compra de uma base de dados
    // enviar email
    // imprimir
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
    }

    public void removerProduto(Produto produto) {
    }

    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<OrdemDeCompra> buscarOrdemDeCompra() {
        return new ArrayList<>();
    }

    public void salvarOrdemDeCompra() {
    }

    public void enviarEmail(String email) {
    }

    public void imprimirOrdemDeCompra() {
    }


}
