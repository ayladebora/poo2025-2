package br.ufpb.dcx.amigosecreto;

import java.util.List;

public class SistemaAmigo {
    private List<Amigo> amigos;
    private List<Mensagem> mensagens;


    public List<Mensagem> pesquisaMensagensAnonimas(){
        //TODO: FAZER DEPOIS
        return null;
    }


    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        //TODO: FAZER DEPOIS
    }
    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException,
            AmigoNaoSorteadoException{
        //TODO: Fazer depois
        return null;

    }

}
