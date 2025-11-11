package br.ufpb.dcx.ayla.apostas;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeApostas {
    private List<ApostaDeJogo> apostas;

    public SistemaDeApostas(){
        this.apostas = new ArrayList<>();
    }

    public List<ApostaDeJogo> pesquisarTodasAsApostas(){
        return this.apostas;
    }

    public List<ApostaDeJogo> pesquisaApostasEmTime(String time){
        List<ApostaDeJogo> listaApostasTime = new ArrayList<>();
        for (ApostaDeJogo a: this.apostas){
            if (a.getNomeTimeA().equals(time) || a.getNomeTimeB().equals(time)){
                listaApostasTime.add(a);
            }
        }
        return listaApostasTime;
    }


    public void cadastrarAposta(String nomeTimeA, String nomeTimeB, int golsTimeA, int golsTimeB)
        throws ApostaJaExisteException {
        ApostaDeJogo aposta = new ApostaDeJogo(nomeTimeA, nomeTimeB, golsTimeA, golsTimeB);
        if (this.apostas.contains(aposta)){
            throw new ApostaJaExisteException("Já existe essa aposta:"+ aposta.toString());
        } else {
            this.apostas.add(aposta);
        }
    }


}
