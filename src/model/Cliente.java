package model;

public class Cliente {
    private String nome;
    private String documento;
    private String celular;
    private int idCliente;
    public Cliente(String nome, String documento, String celular, int idCliente) {

        super();
        this.nome = nome;
        this.documento = documento;
        this.celular = celular;
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void visualizar() {

        System.out.println("==================================================");
        System.out.println("                                                  ");
        System.out.println("================Dados do Cliente==================");
        System.out.println("                                                  ");
        System.out.println("==================================================");
        System.out.println("Id: " + this.idCliente);
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("Endereço: " + this.documento);
        System.out.println("Telefone: " + this.celular);
        System.out.println("==================================================");

    }
}
