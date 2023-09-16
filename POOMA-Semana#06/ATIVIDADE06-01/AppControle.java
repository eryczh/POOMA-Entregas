package com.mycompany.projeto;
import java.util.Scanner;

public class AppControle {
    public static void main(String[] args) {
        ArrayListProduto gerenciador = new ArrayListProduto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Incluir Produto");
            System.out.println("2 - Consultar Produto");
            System.out.println("3 - Excluir Produto");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Listar Produtos");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    System.out.println("Digite o ID do produto:");
                    int id = scanner.nextInt();
                    System.out.println("Digite a Classificação do produto:");
                    int classificacao = scanner.nextInt();
                    System.out.println("Digite o Nome do produto:");
                    String nomeProduto = scanner.next();
                    System.out.println("Digite o Preço do produto:");
                    double precoProduto = scanner.nextDouble();
                    Produto novoProduto = new Produto(id, classificacao, nomeProduto, precoProduto);
                    gerenciador.incluirProduto(novoProduto);
                    System.out.println("Produto incluído com sucesso!");
                    break;

                case 2:
                    
                    System.out.println("Digite o ID do produto a ser consultado:");
                    int idConsulta = scanner.nextInt();
                    Produto produtoConsultado = gerenciador.consultarProdutoPorId(idConsulta);
                    if (produtoConsultado != null) {
                        System.out.println("Produto encontrado:");
                        System.out.println("ID: " + produtoConsultado.getId());
                        System.out.println("Classificação: " + produtoConsultado.getClassificacao());
                        System.out.println("Nome: " + produtoConsultado.getNomeProduto());
                        System.out.println("Preço: " + produtoConsultado.getPrecoProduto());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    
                    System.out.println("Digite o ID do produto a ser excluído:");
                    int idExclusao = scanner.nextInt();
                    boolean excluiu = gerenciador.excluirProdutoPorId(idExclusao);
                    if (excluiu) {
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado para exclusão.");
                    }
                    break;

                case 4:
                    
                    System.out.println("Digite o ID do produto a ser alterado:");
                    int idAlteracao = scanner.nextInt();
                    Produto produtoAlteracao = gerenciador.consultarProdutoPorId(idAlteracao);
                    if (produtoAlteracao != null) {
                        System.out.println("Digite a nova Classificação do produto:");
                        int novaClassificacao = scanner.nextInt();
                        System.out.println("Digite o novo Nome do produto:");
                        String novoNomeProduto = scanner.next();
                        System.out.println("Digite o novo Preço do produto:");
                        double novoPrecoProduto = scanner.nextDouble();
                        Produto novoProdutoAlterado = new Produto(idAlteracao, novaClassificacao, novoNomeProduto, novoPrecoProduto);
                        boolean alterou = gerenciador.alterarProduto(novoProdutoAlterado);
                        if (alterou) {
                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Erro ao alterar o produto.");
                        }
                    } else {
                        System.out.println("Produto não encontrado para alteração.");
                    }
                    break;

                case 5:
                    
                    System.out.println("Lista de Produtos:");
                    for (Produto produto : gerenciador.listarProdutos()) {
                        System.out.println("ID: " + produto.getId());
                        System.out.println("Classificação: " + produto.getClassificacao());
                        System.out.println("Nome: " + produto.getNomeProduto());
                        System.out.println("Preço: " + produto.getPrecoProduto());
                        System.out.println("------------------------");
                    }
                    break;

                case 0:
                    
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

