package br.ufpb.dcx.professores;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class SistemaGerenciaProfsMap implements SistemaGerenciaProfs{

    private Map <Integer, Professor> professores = new HashMap<>();
    private Map <Integer, Disciplina> disciplinas = new HashMap<>();


    public Professor pesquisaProfessor(int matriculaProf)
            throws ProfessorInexistenteException{
        Professor p = this.professores.get(matriculaProf);
        if (p == null)
            throw new ProfessorInexistenteException ("Não existe professor com essa  matrícula:"
                    + matriculaProf);
        else
            return p;
    }
    public List<Horario> consultaHorariosDeAulaDoProfessor(int matriculaProf)
            throws ProfessorInexistenteException{
        List <Horario> horarios = new LinkedList<>();
        boolean acheiProfessor = false;
        for (Disciplina d: this.disciplinas.values()){
            if (d.getMatriculaProfessor() == matriculaProf){
                horarios.addAll(d.getHorarios());
                acheiProfessor = true;
            }
        }

        if (!acheiProfessor){
            throw new ProfessorInexistenteException("Não foi encontrado nenhum horário para este professor no sistema");
        } else {
            return horarios;
        }
    }

    public List <String> consultaNomesDisciplinasDoProfessor(int matriculaProf){
        //TODO
        return null;
    }
    public void cadastraProfessor(int matriculaProf, String nome)
            throws ProfessorJaExisteException{
        //TODO

    }
    public void cadastraDisciplina(String nomeDisciplina, int codigoDisciplina,  int matriculaProfessor, List<Horario> horarios) throws
            DisciplinaJaExisteException{
        //TODO
    }
    public Disciplina pesquisaDisciplina(int codigoDisciplina) throws
            DisciplinaInexistenteException{
        //TODO
        return null;
    }



}
