package repository;

import model.Produto;

public interface RepositoryProduto {
    void cadastrar(Produto produto);

    void atualizar(Produto produto);

    void procurarProduto(int idProduto);

    void listarProduto();

    void deletarProduto(int idProduto);
}
