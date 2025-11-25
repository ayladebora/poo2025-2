package br.ufpb.dcx.ayla.pessoas;


import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this(nome, 0);
    }

    public Pessoa(){
        this("sem nome",0);
    }

    public int compareTo(Pessoa p){
        if (this.idade < p.getIdade()){
            return -1;
        } else if (this.idade== p.getIdade()){
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
