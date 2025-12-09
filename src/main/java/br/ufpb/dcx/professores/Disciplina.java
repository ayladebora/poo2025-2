package br.ufpb.dcx.professores;

import java.io.Serializable;
import java.util.List;

public class Disciplina implements Serializable {
    private String nome;
    private int codigo;
    private int matriculaProf;

    private List<Horario> horarios;

    public Disciplina(String nome, int codigo, int matriculaProf, List<Horario> horarios){
        this.nome = nome;
        this.codigo = codigo;
        this.matriculaProf = matriculaProf;
        this.horarios = horarios;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getMatriculaProfessor() {
        return matriculaProf;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
}
