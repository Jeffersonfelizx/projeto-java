import controller.ControllerCliente;
import controller.ControllerProduto;
import model.Cliente;
import model.Produto;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ControllerCliente clientes = new ControllerCliente();

        ControllerProduto produto = new ControllerProduto();

        int opcao,quantidade,idCliente,idProduto;
        String nome,documento,celular,nomeProduto,motivoDevolucao,produtoDevolvido;
        double valor;
        LocalDate dataDevolucao;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================================================");
            System.out.println("                                                  ");
            System.out.println("========== Bem vindos ao AquiExpress ========");
            System.out.println("                                                  ");
            System.out.println("==================================================");
            System.out.println("\t1- Cadastrar Cliente");
            System.out.println("\t2- Listar Clientes");
            System.out.println("\t3- Atualizar Cadastro Clientes");
            System.out.println("\t4- Excluir Cadastro Clientes");
            System.out.println("\t5- Cadastrar Produtos");
            System.out.println("\t6- Listar Produtos");
            System.out.println("\t7- Atualizar Produtos");
            System.out.println("\t8- Excluir Produtos");
            System.out.println("\t9- Registrar Devoluções de Produtos");
            System.out.println("\t10- Listar Devoluções de Produtos");
            System.out.println("\t11- Registrar Vendas");
            System.out.println("\t12- Total de Vendas");
            System.out.println("\t13- Estoque em Separação");
            System.out.println("\t14- Enviado ao Destinario");
            System.out.println("\t0- Sair");
            System.out.println("==================================================");
            System.out.println("Digite a opção desejada: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("Agradecemos a visita ao AquiExpress o numero 1 da America do Sul");
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> {

                    System.out.println("Cadastrar Cliente");

                    do {
                        System.out.println("Digitar o Nome do Cliente: ");
                        sc.skip("\\R?");
                        nome = sc.nextLine();

                        if (nome.isEmpty())
                            System.out.println("Não pode estar vazio!");

                    } while (nome.isEmpty());

                    do {
                        System.out.println("Digitar o CPF ou CNPJ do Cliente: ");
                        sc.skip("\\R?");
                        documento = sc.nextLine();

                        if (documento.isEmpty())
                            System.out.println("O CPF/CNPJ Não pode está vazio");

                    } while (documento.isEmpty());

                    do {
                        System.out.println("Digitar o numero de celular do Cliente: ");
                        sc.skip("\\R?");
                        celular = sc.nextLine();

                        if (celular.isEmpty())
                            System.out.println("Não pode estar vazio!");

                    } while (celular.isEmpty());

                    clientes.cadastrar(new Cliente(nome, documento, celular, clientes.gerarIdCliente()));

                    keyPress();
                }
                case 2 -> {
                    System.out.println("Listar Clientes");
                    clientes.listarClientes();
                    keyPress();
                }
                case 3 -> {
                    System.out.println("Atualizar Cadastro de Clientes");

                    System.out.println("Id Cliente: ");
                    idCliente = sc.nextInt();

                    if (clientes.buscarClienteCollection(idCliente) != null) {

                        do {
                            System.out.println("Nome do Cliente: ");
                            sc.skip("\\R?");
                            nome = sc.nextLine();

                            if (nome.isEmpty())
                                System.out.println("Não pode estar vazio!");

                        } while (nome.isEmpty());

                        do {
                            System.out.println("CPF: ");
                            sc.skip("\\R?");
                            documento = sc.nextLine();

                            if (documento.isEmpty())
                                System.out.println("Não pode estar vazio!");

                        } while (documento.isEmpty());

                        do {
                            System.out.println("Número de Telefone:");
                            sc.skip("\\R?");
                            celular = sc.nextLine();

                            if (celular.isEmpty())
                                System.out.println("Não pode estar vazio!");

                        } while (celular.isEmpty());

                        clientes.atualizar(new Cliente(nome, documento, celular, idCliente));

                    } else
                        System.out.println("O Cliente não foi encontrado!");
                    keyPress();
                }
                case 4 -> {
                    System.out.println("Excluir Cadastro");

                    System.out.println("IdCliente: ");
                    idCliente = sc.nextInt();

                    clientes.deletarCliente(idCliente);

                    keyPress();
                }
                case 5 -> {
                    System.out.println("Cadastrar Produto");

                    do {
                        System.out.println("Digite o nome do Produto: ");
                        sc.skip("\\R?");
                        nomeProduto = sc.nextLine().toLowerCase();

                        if (nomeProduto.isEmpty())
                            System.out.println("Não pode estar vazio!");

                    } while (produto == null);

                    do {
                        System.out.println("Digite o valor: ");
                        sc.skip("\\R?");
                        valor = sc.nextDouble();

                        if (valor <= 0)
                            System.out.println("Não pode estar vazio!");

                    } while (produto == null);

                    System.out.println("Digite a Quantidade ");
                    quantidade = sc.nextInt();

                    produto.cadastrar(new Produto(produto.gerarIdProduto(), nomeProduto, valor, quantidade));

                    keyPress();
                }
                case 6 -> {
                    System.out.println("Listar Produtos");
                    produto.listarProduto();
                    keyPress();
                }
                case 7 -> {
                    System.out.println("Atualizar Produtos");

                    System.out.println("Digite o nome do Produto: ");
                    idProduto = sc.nextInt();
                    if (produto.buscarProdutoNaCollectio(idProduto) != null) {

                        do {
                            System.out.println("Digite o Nome do Produto: ");
                            sc.skip("\\R?");
                            nomeProduto = sc.nextLine();

                            if (nomeProduto.isEmpty())
                                System.out.println("Não pode estar vazio!");

                        } while (nomeProduto.isBlank());

                        do {
                            System.out.println("Digite o valor: ");
                            valor = sc.nextDouble();

                            if (valor<=0)
                                System.out.println("Não pode estar vazio!");

                        } while (valor>0);

                        System.out.println("Digite o Ano: ");
                        quantidade = sc.nextInt();


                        produto.atualizar(new Produto(idProduto, nomeProduto, valor,quantidade));
                    }
                    keyPress();
                }
                case 8 -> {
                    System.out.println("Excluir Produto");
                    System.out.println("Digite o Id do Produto: ");
                    idProduto = sc.nextInt();
                    produto.deletarProduto(idProduto);
                    keyPress();
                }
                case 9 -> {
                    System.out.println("Registrar Vendas: ");
                    System.out.println("Digite o nome do Produto: ");
                    nomeProduto = sc.nextLine();
                    System.out.println("Quantidade de Produto: ");
                    sc.skip("\\R?");
                    quantidade = sc.nextInt();

                    //pr.registrarVendas(nomeProduto, quantidade);

                    keyPress();
                }
                case 10 -> {
                    System.out.println("\nTotal de Vendas");
                    System.out.println("=======================");

                }

                default -> {
                    System.out.println("\nOpção Inválida!");
                    keyPress();
                }

            }

        }

    }

    public static void keyPress() {

        try {

            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {
            System.out.println("\nDigite a tecla Enter!");
        }
    }
}