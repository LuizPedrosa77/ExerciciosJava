package PooPizzaria;

import java.util.ArrayList;

public class ControleDeProdutos {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public ControleDeProdutos() {
    }

    // Vender produtos
    public double venderProduto(int idProduto, int quantidadeVenda) {
        this.listarProdutos();
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getId() == idProduto) {
                double valorTotal = produtos.get(i).getId() * quantidadeVenda;
                System.out.println("O valor total do produto é: R$"+ String.format("%.2f", valorTotal));
                return valorTotal;
            }
        }

        System.out.println("Produto não encontrado!");
        return 0.0;

    }

    // Listar produtos
    public void listarProdutos() {
        if(produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            for(int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i));
                System.out.println();
            }
        }
    }

    // Adicionar produto
    public void adicionarProduto(Produto item) {
        produtos.add(item);
    }
 
    // Deletar produto
    public void deletarProduto(int idParaDeletar) {
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getId() == idParaDeletar) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso!");
                System.out.println();
                return;
            }
        }

        System.out.println("Produto não encontrado!");
        System.out.println();
    }

}
