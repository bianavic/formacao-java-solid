package org.edu.fabs.DIP.problem;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    // QUEBRA PRINCIPIO
    // - caso precise adicionar novo banco de dados, precisarmeos modificar esta classe

    // abaixo: nao estamos dependendo de uma interface, mas diretamente da classe MySqlConnection
    // se necessitar colocar um banco Oracle, precisaremos criar ProdutoRepositoryOracle com os mesmos elementos desta classe,
    // apenas para modificar a conexao
    private MySqlConnection mySqlConnection;

    // nao deixar a construcao da conexao com o banco como responsabilidade do ProdutoRepository
    public ProdutoRepository() {
        this.mySqlConnection = new MySqlConnection();
    }

    public List<Produto> buscarProdutos() {
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {}

}
