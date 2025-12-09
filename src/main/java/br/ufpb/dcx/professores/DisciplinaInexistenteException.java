package br.ufpb.dcx.professores;

public class DisciplinaInexistenteException extends Exception{
    public DisciplinaInexistenteException(String msg){
        super(msg);
    }
}
