package br.ufpb.dcx.professores;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class TesteBesta {
    public static void main(String [] args){
        Horario aula1 = new Horario(DiaDaSemana.TERCA,8, 10);
        Horario aula2 = new Horario(DiaDaSemana.TERCA, 13, 15);
        System.out.println("Dia da semana da aula 1:"+ aula1.getDia());
        List<Horario> horariosPoo = new ArrayList<>();
        horariosPoo.add(aula1);
        horariosPoo.add(aula2);

        List<Horario> horariosLP = new ArrayList<>();
        horariosLP.add(new Horario(DiaDaSemana.TERCA, 10, 12));
        horariosLP.add(new Horario(DiaDaSemana.QUINTA, 8, 10));

        Disciplina pooTurma1 = new Disciplina("POO", 83111, 1694, horariosPoo);
        Disciplina lpTurmaAyla  = new Disciplina("LP", 81999, 1694, horariosLP);


        Professor p1 = new Professor("Ayla", 123);
        Collection<Professor> professores = new ArrayList<>();
        professores.add(p1);

        GravadorDeProfessores gravador = new GravadorDeProfessores();
        try {
            Collection<Professor> professoresAchados = gravador.lerDadosDeProfessores();
            for (Professor p: professoresAchados){
                System.out.println("Achei "+ p.getNome());
            }
            professoresAchados.add(new Professor("Luiz", 333));
            gravador.gravarDadosDeProfessores(professoresAchados);
            //gravador.gravarDadosDeProfessores(professores);
        } catch(Exception e){
            e.printStackTrace();
        }


    }
}
