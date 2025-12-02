package br.ufpb.dcx.ayla.pessoas;

public class TestaPessoas {

    public static void main(String [] args){
        Pessoa p1 = new Pessoa("Maria", 32);
        Pessoa p2 = new Pessoa("José", 22);
        if (p1.compareTo(p2)<0){
            System.out.println("Maria vem antes");
        } else if (p1.compareTo(p2)>0){
            System.out.println("José vem antes");
        } else {
            System.out.println("Estão na mesma posição");
        }

        String nome1 = "Maria";
        String nome2 = "José";
        if (nome1.compareTo(nome2)<0){
            IO.println("nome1 vem antes");
        } else if (nome1.compareTo(nome2)>0){
            IO.println("nome2 vem antes");
        }

    }
}
