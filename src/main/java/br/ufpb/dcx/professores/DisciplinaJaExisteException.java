package br.ufpb.dcx.professores;

public class DisciplinaJaExisteException extends Exception{
    public DisciplinaJaExisteException(String msg){
        super(msg);
    }
}
