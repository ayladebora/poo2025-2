package br.ufpb.dcx.professores;

public class Professor {
    private int matricula;
    private String nome;

    public Professor(String nome, int matricula){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public int getMatricula(){
        return this.matricula;
    }
}
