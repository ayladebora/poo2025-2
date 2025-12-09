package br.ufpb.dcx.professores;

import java.io.Serializable;
public class Horario implements Serializable {
    private int horaInicio;
    private int horaFim;
    private DiaDaSemana dia;

    public Horario(DiaDaSemana dia, int horaInicio, int horaFim){
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public DiaDaSemana getDia(){
        return this.dia;
    }

    public int getHoraInicio(){
        return this.horaInicio;
    }

    public int getHoraFim(){
        return this.horaFim;
    }
}
