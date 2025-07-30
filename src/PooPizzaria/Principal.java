package PooPizzaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo a Pizzaria redonda!");

        // Instancia da classe ControleDeProdutos
        ControleDeProdutos produtos = new ControleDeProdutos();

        // Condição para repetição do "while"
        boolean parar = false;
        String nomeProduto;
        double valorProduto;
        int proximoId = 1;
        int produtoId;
        int quantidade;

        // Repetição do menu
        while (!parar) {

            try {                
            // Mostrando as opções do Menu
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();
            System.out.println("[1] Vender Produtos");
            System.out.println("[2] Lista de produtos");
            System.out.println("[3] Adicionar produtos");
            System.out.println("[4] Deletar produtos");
            System.out.println("[5] Sair (fechar programa)");
            int opcao = leitor.nextInt();
            leitor.nextLine();


            // Execultando as opções do Menu
            switch (opcao) {

                // Venda do produto
                case 1:
                    System.out.println("Digite o id do produto que deseja vender: ");
                    produtoId = leitor.nextInt();
                    System.out.println("Digite a quantidade do produto: ");
                    quantidade = leitor.nextInt();
                    leitor.nextLine();
                    double totalVenda = produtos.venderProduto(produtoId, quantidade);
                    break;

                // Listar Produtos
                case 2:
                    produtos.listarProdutos();
                    System.out.println();
                    break;

                // Adicionando produto
                case 3:
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = leitor.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    valorProduto = leitor.nextDouble();
                    leitor.nextLine();
                    produtos.adicionarProduto(new Produto(nomeProduto, proximoId, valorProduto));
                    proximoId++;
                    System.out.println();
                    System.out.println("Produto '" + nomeProduto + "' adicionado com sucesso!");      
                    break;

                // Deletar produtos
                case 4:
                    System.out.println("Produtos disponíveis: ");
                    produtos.listarProdutos();
                    System.out.println("Digite o ID do produto que deseja excluir: ");
                    produtoId = leitor.nextInt();
                    produtos.deletarProduto(produtoId);
                    break;

                // Encerrando o programa
                case 5:
                    parar = true;
                    System.out.println("Encerrando o programa...");
                    break;
                default: 
                    System.out.println("Opção invalida! Por favor, escolha uma opção de 1 a 5.");    
            
            }

             } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número para a opção ou valor.");
                leitor.nextLine(); 
            } catch (Exception e) { 
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                leitor.nextLine(); 
            }
        }              
        
        leitor.close(); // Fechando o while

        System.out.println("Programa finalizado. Até mais!");
    }
}
