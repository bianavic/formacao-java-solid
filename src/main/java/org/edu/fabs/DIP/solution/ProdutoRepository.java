package org.edu.fabs.DIP.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private DbConnection dbConnection;

    // ProdutoRepository dependendo da ABSTRACAO
    // ou seja, poderemos usar ProdutoRepository independentemente do banco de dados utilizado
    public ProdutoRepository(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<Produto> buscarProdutos() {
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {}

}
