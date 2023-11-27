package controller;

import java.util.ArrayList;


import model.Cliente;
import repository.RepositoryCliente;

public class ControllerCliente implements RepositoryCliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    @Override
    public void cadastrar(Cliente cliente) {
        listaClientes.add(cliente);
        System.out.println("O Cliente foi cadastrado!");

    }

    @Override
    public void atualizar(Cliente cliente) {
        var buscaCliente = buscarClienteCollection(cliente.getIdCliente());

        if (buscaCliente != null) {
            listaClientes.set(listaClientes.indexOf(buscaCliente), cliente);
            System.out.println("\nO Cliente " + cliente.getIdCliente() + " foi atualizado!");

        }

        else {
            System.out.println("\nO Cliente " + cliente.getIdCliente() + " nao foi encontrado!");
        }
    }

    @Override
    public void procurarCliente(int idCliente) {
        var cliente = buscarClienteCollection(idCliente);

        if (cliente != null)
            cliente.visualizar();
        else
            System.out.println("\nO Cliente " + idCliente + " nao foi encontrado!");

    }

    @Override
    public void listarClientes() {
        for (var cliente : listaClientes)
            cliente.visualizar();

    }

    @Override
    public void deletarCliente(int idCliente) {
        var cliente = buscarClienteCollection(idCliente);

        if (cliente != null) {
            if (listaClientes.remove(cliente) == true)
                System.out.println("\nO Cliente " + idCliente + " foi deletado!");
        } else
            System.out.println("\nO Cliente " + idCliente + " nao foi encontrado!");

    }

    public Cliente buscarClienteCollection(int idCliente) {
        for (var cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente)
                return cliente;
        }
        return null;
    }

    public int gerarIdCliente() {
        return listaClientes.size() + 1;
    }

}
