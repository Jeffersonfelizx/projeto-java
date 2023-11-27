package controller;
import java.util.ArrayList;

import model.Produto;
import repository.RepositoryProduto;

public class ControllerProduto implements RepositoryProduto{
    private ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    int idProduto = 0;

    @Override
    public void cadastrar(Produto produto) {
        listaProduto.add(produto);
        System.out.println("Produto Cadastrado");
    }

    @Override
    public void atualizar(Produto produto) {
        var procurarProduto= buscarProdutoNaCollectio(produto.getIdProduto());
        if (procurarProduto != null) {
            listaProduto.set(listaProduto.indexOf(procurarProduto), produto);
            System.out.println("O Produto foi atualizado");
        } else
            System.out.println("O Produto não foi encontrado");
    }

    @Override
    public void procurarProduto(int idProduto) {
        var produto = buscarProdutoNaCollectio(idProduto);

        if (produto != null)
            produto.visualizar();
        else
            System.out.println("O Produto " + idProduto + " Não foi encontrado");
    }

    @Override
    public void listarProduto() {
        for (var produto : listaProduto) {
            produto.visualizar();
        }

    }

    @Override
    public void deletarProduto(int idProduto) {
        var produto = buscarProdutoNaCollectio(idProduto);

        if (produto != null) {
            if (listaProduto.remove(produto) == true)
                System.out.println("O Produto foi excluido");
        } else
            System.out.println("O Produto não foi encontrado!");
    }

    public Produto buscarProdutoNaCollectio(int idProduto) {
        for (var produto : listaProduto) {
            if (produto.getIdProduto() == idProduto)
                return produto;
        }
        return null;
    }

    public int gerarIdProduto() {
        return ++idProduto;
    }

}
