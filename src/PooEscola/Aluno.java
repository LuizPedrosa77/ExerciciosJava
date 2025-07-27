package PooEscola;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {

    // Atributo
    private Date dataNascimento;
    
    Turma turma;

    // Construtores
    public Aluno(String nome, int matricula, Date dataNascimento) {
        super(nome, matricula);
        this.dataNascimento = dataNascimento;
    }

    // Metodo Get e Set
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    // Metodo de acao
    public void dataNascimento() {

    }

    // Metodo para retornar os Atributos
    public String toString() {
        return "Data de nascimento: " + dataNascimento;
    }
    

    public String getApresentar() {
        return "Data de nascimento: " + dataNascimento;
    }
}
