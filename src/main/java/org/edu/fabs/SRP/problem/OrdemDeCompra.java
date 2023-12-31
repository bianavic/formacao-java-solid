package org.edu.fabs.SRP.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {}
    public void removerProduto(Produto produto) {}

    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<OrdemDeCompra> buscarOrdemDeCompra() {
        return new ArrayList<>();
    }

    public void salvarOrdemDeCompra() {}

    public void enviarEmail(String email) {}

    public void imprimirOrdemDeCompra() {}


}
