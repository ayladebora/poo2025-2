package br.ufpb.dcx.professores;

public class Horario {
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
