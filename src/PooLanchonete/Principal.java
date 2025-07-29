package PooLanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);

        Servicos servicos = new Servicos();
        ArrayList<Produto> produtos = new ArrayList<>();

        boolean parar = false;
        int id = 1;


        while(!parar) {

            int opcao = menu(leitor);

            switch (opcao) {

                case 1:
                    servicos.venderProduto(produtos);
                    break;

                case 2:
                    produtos.add(servicos.adicionarProduto(id));
                    id++;
                    break;
                
                case 3:
                    servicos.listarProdutos(produtos);
                    break;

                case 4:
                    servicos.deletarProduto(produtos);
                    break;

                case 5:
                    parar = true;
                    System.out.println("Encerrando, volte sempre!");
                    break;
            }
        }
    

    }
    
    public static int menu(Scanner leitor) {
        System.out.println();
        System.out.println("digite a opção desejada: ");
        System.out.println();
        System.out.println("[1] Vender produto");
        System.out.println("[2] Adicionar produto");
        System.out.println("[3] Lista produto");
        System.out.println("[4] Deletar produto");
        System.out.println("[5] Sair (Encerrar o programa)");
        
        int opcao = leitor.nextInt();
        leitor.nextLine();
        
        return opcao;
        
    }
}