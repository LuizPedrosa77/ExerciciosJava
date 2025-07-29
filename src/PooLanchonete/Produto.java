package PooLanchonete;

public class Produto {

    // Atributo
    private int id;
    private String nome;
    private double valor;


    // Construtor padrão
    public Produto() {
        id = 0;
        nome = "";
        valor = 0.0;
    }

    // construtor com parametros
    public Produto(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }


    // Get e Set
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Metodo de retorno toString
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", valor=R$" + valor +"]";
    }
    

}
