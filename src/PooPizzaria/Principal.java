package PooPizzaria;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo a Pizzaria redonda!");

        // Condição para repetição do "while"
        boolean parar = false;

        // Repetição do menu
        while (!parar) {


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
                case 5:
                    parar = true;
                    System.out.println("Encerrando o programa...");
                    break;
                default: 
                    System.out.println("Opção invalida!");    
            
            } 

        } leitor.close(); // Fechando o while
    }
}
