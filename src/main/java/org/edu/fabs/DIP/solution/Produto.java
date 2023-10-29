package org.edu.fabs.DIP.solution;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
