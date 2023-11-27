package model;

public class Produto {

    private int idProduto;
    private String nomeProduto;
    private double valor;
    private int quantidade;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(int idProduto, String nomeProduto, double valor, int quantidade) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void visualizar() {
        System.out.println("==================================================");
        System.out.println("================DADOS DO PRODUTO====================");
        System.out.println("==================================================");
        System.out.println("Id do Produto: " + this.idProduto);
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Valor do Produto: " + this.valor);
        System.out.println("Quantidade do Produto: " + this.quantidade);
        System.out.println("===============================================");
    }

}
