package PooEscola;

import java.util.ArrayList;

public class Disciplina {

    // Atributo
    private String nome;
    private int cargaHoraria;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    // Construtor
    public Disciplina (String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    // Get e Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


    // Metodo para retornar os Atributos
    public String toString() {
        return "Nome: " + nome + ", Carga horaria: " + cargaHoraria + ", Professor: " + professores + ", Turmas: " + turmas;
    }

    public String getApresentar() {
        return "Nome: " + nome + ", Carga horaria: " + cargaHoraria + ", Professor: " + professores + ", Turmas: " + turmas;
    }

}
