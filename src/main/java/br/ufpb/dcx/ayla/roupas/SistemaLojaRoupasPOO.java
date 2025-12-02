package br.ufpb.dcx.ayla.roupas;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas {

    private Map<String, Roupa> roupasMap;


    public SistemaLojaRoupasPOO() {
        this.roupasMap = new HashMap<>();
    }

    @Override
    public void cadastraRoupa(String codigoRoupa, String descricao, Tamanho tamanho, int quantidade) throws RoupaJaExisteException {
        if (this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaJaExisteException("Roupa já cadastrada: " + codigoRoupa);
        } else {
            Roupa roupa = new Roupa(codigoRoupa, descricao, tamanho, quantidade);
            this.roupasMap.put(codigoRoupa, roupa);
        }
    }

    @Override
    public List <Roupa> pesquisaRoupasPorTamanho(Tamanho tamanhoRoupa) {
        List<Roupa> roupasPorTamanho = new ArrayList<>();
        for (Roupa roupa: this.roupasMap.values()){
            if (roupa.getTamanho().equals(tamanhoRoupa)){
                roupasPorTamanho.add(roupa);
            }
        }
        return roupasPorTamanho;
    }

    public void alteraQuantidadeDeRoupaNoEstoque(String codigoRoupa,
                                                 int novaQuantidade)
                                                    throws RoupaInexistenteException{
        if (!this.roupasMap.containsKey(codigoRoupa)){
            throw new RoupaInexistenteException("Não existe roupa com o código "+ codigoRoupa);
        } else {
            Roupa roupaAAlterar = this.roupasMap.get(codigoRoupa);
            roupaAAlterar.setQuantidade(novaQuantidade);
        }

    }

    public Roupa pesquisaRoupa(String codigoRoupa) throws RoupaInexistenteException{
        Roupa roupaAchada = this.roupasMap.get(codigoRoupa);
        if (roupaAchada == null){
            throw new RoupaInexistenteException("Não existe roupa com o código pesquisado: "+ codigoRoupa);
        } else {
            return roupaAchada;
        }
    }


    public List <Roupa> pesquisaRoupasComDescricaoComecandoCom(
            String prefixoDescricao){
        List<Roupa> roupasComDescricao = new ArrayList<>();
        for (Roupa roupa: this.roupasMap.values()){
            if (roupa.getDescricao().startsWith(prefixoDescricao)){
                roupasComDescricao.add(roupa);
            }
        }
        return roupasComDescricao;
    }


    public Tamanho consultaTamanhoDaRoupa(String codigoRoupa)
            throws RoupaInexistenteException{
        if (this.roupasMap.containsKey(codigoRoupa)){
            return this.roupasMap.get(codigoRoupa).getTamanho();
        } else {
            throw new RoupaInexistenteException("Não existe roupa com o código "+  codigoRoupa);
        }
    }

    public int pesquisaQuantidadeDeRoupaNoEstoque(String codigoRoupa)
            throws RoupaInexistenteException{
        return this.pesquisaRoupa(codigoRoupa).getQuantidade();
    }



//restante da classe
}
