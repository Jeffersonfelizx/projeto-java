package repository;
import model.Cliente;

public interface RepositoryCliente {
    public void cadastrar(Cliente cliente);

    public void atualizar(Cliente cliente);

    public void procurarCliente(int idCliente);

    public void listarClientes();

    public void deletarCliente(int idCliente);
}
