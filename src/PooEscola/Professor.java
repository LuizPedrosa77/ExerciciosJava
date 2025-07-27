package PooEscola;

import java.util.ArrayList;

public class Professor extends Pessoa {

    // Atributo
    private String formacaoAcademica;
    private double salario;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    // Construtores
    public Professor(String nome, int matricula, String formacaoAcademica, double salario) {
        super(nome, matricula);
        this.formacaoAcademica = formacaoAcademica;
        this.salario = salario;
    }

    // Get e set
    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    // Metodo acao
    public void aplicarAvaliazao() {

    }

    // Metodo para retornar os Atributos
    public String toString() {
        return "Formação academia: " + formacaoAcademica + ", Salario: " + salario + ", Disciplinas: " + disciplinas + ", Turmas: " + turmas;
    }

    public String getApresentar() {
       return "Formação academia: " + formacaoAcademica + ", Salario: " + salario + ", Disciplinas: " + disciplinas + ", Turmas: " + turmas;
    }
}
