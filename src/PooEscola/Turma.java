package PooEscola;

import java.util.ArrayList;

public class Turma {

    // Atributo
    private String sigla;
    private int ano;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    // construtor
    public Turma(String sigla, int ano) {
        this.sigla = sigla;
        this.ano = ano;
    }

    // Get e Set
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    // Metodo acao
    public void adicionarAluno() {

    }

    // Metodo para retornar os Atributos
    public String toString() {
        return "Ano: "+ ano + ", Sigla: " + sigla + ", Alunos: " + alunos + ", Professor: " + professores + ", Disciplina: " + disciplinas;
    }

    public String getApresentar() {
        return "Ano: "+ ano + ", Sigla: " + sigla + ", Alunos: " + alunos + ", Professor: " + professores + ", Disciplina: " + disciplinas;
    }

}
