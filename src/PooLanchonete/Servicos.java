package PooLanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicos {


    
    Scanner leitor = new Scanner(System.in);

    public Produto adicionarProduto (int id) {

        System.out.println();
        System.out.println("Digite o nome do produto: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = leitor.nextDouble();
        leitor.nextLine();
        
        Produto produtos = new Produto(id, nome, valor);
        
        
        System.out.println("Produto adicionado com sucesso!");
        System.out.println();
        return produtos;
    }

    public void listarProdutos(ArrayList<Produto> produtos) {
        
        
        // isEmpty -> significa vazio
        if(produtos.isEmpty()) {
            System.out.println();
            System.out.println("Não tem nenhum produto cadastrado");
            return;
        }

        System.out.println("Lista de produtos: ");
        
        for(int i = 0; i < produtos.size(); i++) { // size -> tamanho em ingles. Então fica: produtos.tamanho (para ver a quantidade de produtos)
            System.out.println(produtos.get(i).toString());
        }
        System.out.println();
    }

    public void deletarProduto(ArrayList<Produto> produtos) {
        if(produtos.isEmpty()) {
            System.out.println("Não existe produtos para deletar");
            return;
        }

        listarProdutos(produtos);
        System.out.println("Digite a id do produto que deseja excluir: ");
        int idEscolhido = leitor.nextInt();
        leitor.nextLine();

        for(int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == idEscolhido) {
                produtos.remove(i);
                System.out.println("Produto escluido com sucesso!");
                System.out.println();
                return;
            }
        }

        System.out.println("Id não encontrado!");
        System.out.println();

    }

    public void venderProduto(ArrayList<Produto> produtos) {
        
        System.out.println();
        if(produtos.isEmpty()) {
            System.out.println("Não existe produto cadastrado para vender!");
            System.out.println();
        }

        listarProdutos(produtos);
        System.out.println("digite a id do produto que deseja vender: ");
        int idVenda = leitor.nextInt();
        leitor.nextLine();
        
        
        Produto produtoSelecionado = null;
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getId() == idVenda) {
                produtoSelecionado = produtos.get(i);
                break;
            }

        }

        System.out.println("Digite a quantidade de produtos para vender: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();
        

        System.out.println();
        System.out.println("Total da venda: R$"+produtoSelecionado.getValor()*quantidade);
        System.out.println("Venda realizada com sucesso!");


    }

}
