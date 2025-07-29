package PooPizzaria;

public class Produto {

    // Atributos
    private String nome;
    private int id;
    private double valor;

    // Construtor padrão
    public Produto() {
        nome = "";
        id = 0;
        valor = 0.0;
    }
    // Construtor com parametros
    public Produto(String nome, int id, double valor) {
        this.nome = nome;
        this.id = id;
        this.valor = valor;
    }

    // Get e Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "[Produto nome=" + nome + ", id=" + id + ", valor= R$" + valor + "]";
    }




    



}
