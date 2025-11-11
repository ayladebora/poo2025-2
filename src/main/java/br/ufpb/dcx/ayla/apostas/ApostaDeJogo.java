package br.ufpb.dcx.ayla.apostas;

import java.util.Objects;

public class ApostaDeJogo {

    private int numGolsTimeA;
    private int numGolsTimeB;
    private String nomeTimeA;
    private String nomeTimeB;

    public ApostaDeJogo(String nomeTimeA, String nomeTimeB, int golsTimeA, int golsTimeB){
        this.nomeTimeA = nomeTimeA;
        this.nomeTimeB = nomeTimeB;
        this.numGolsTimeA = golsTimeA;
        this.numGolsTimeB = golsTimeB;
    }

    public ApostaDeJogo(){
        this("","",0,0);
    }

    public int getNumGolsTimeA(){
        return this.numGolsTimeA;
    }

    public int getNumGolsTimeB() {
        return this.numGolsTimeB;
    }

    public String getNomeTimeA() {
        return this.nomeTimeA;
    }

    public String getNomeTimeB() {
        return this.nomeTimeB;
    }

    public String toString(){
        return this.nomeTimeA + " : "+ this.numGolsTimeA+ " x " + this.numGolsTimeB+ " : "+ this.nomeTimeB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ApostaDeJogo that = (ApostaDeJogo) o;
        return numGolsTimeA == that.numGolsTimeA &&
                numGolsTimeB == that.numGolsTimeB &&
                Objects.equals(nomeTimeA, that.nomeTimeA) &&
                Objects.equals(nomeTimeB, that.nomeTimeB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numGolsTimeA, numGolsTimeB, nomeTimeA, nomeTimeB);
    }
}
