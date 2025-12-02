package br.ufpb.dcx.ayla.roupas;

public class Roupa {
    private String codigo;
    private String descricao;
    private int quantidade;
    private Tamanho tamanho;

    public Roupa(String codigo, String descricao, Tamanho tamanho, int quantidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Tamanho getTamanho(){
        return this.tamanho;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Roupa de código "+this.codigo+", descrição:"
                + this.descricao+" de tamanho "
                + this.tamanho+" com a seguinte quantidade no estoque "
                + this.quantidade;
    }
}
