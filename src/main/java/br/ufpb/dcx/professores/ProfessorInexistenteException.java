package br.ufpb.dcx.professores;

public class ProfessorInexistenteException extends Exception{

    public ProfessorInexistenteException(String msg){
        super(msg);
    }
}
