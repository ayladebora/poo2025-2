package br.ufpb.dcx.professores;

public class ProfessorJaExisteException extends Exception{
    public ProfessorJaExisteException(String msg){
        super(msg);
    }
}
