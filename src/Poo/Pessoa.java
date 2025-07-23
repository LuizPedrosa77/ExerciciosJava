package Poo;
public class Pessoa {

    // Atributo
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;
    private String whatsapp;

    // Construtor padrao
    public Pessoa() {
        nome = "";
        cpf = "";
        idade = 0;
        sexo = 'm';
        whatsapp = "";
    }

    // Contrutor com parametro
    public Pessoa(String nome, String cpf, int idade, char sexo, String whatsapp) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.whatsapp = whatsapp; 
    }

    // Metodos podem ser o "set" e "get" 
    // mas também pode ser os comportamentos e ações dentro do programa

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }


    // Metodos que tem acao
    public void apresentar() {
      System.out.println(nome);
      System.out.println(cpf);
      System.out.println(idade);
      System.out.println(sexo);
      System.out.println(whatsapp);
    }
    

}
