package br.ufpb.dcx.ayla.apostas;

import java.util.List;

public class ProgramaDeApostasRT {

    void main(){
        SistemaDeApostas sistema = new SistemaDeApostas();
        boolean continuar = true;
        while(continuar){
            String opcao = IO.readln("Digite uma opção:\n1.Cadastrar aposta\n2.Pesquisar todas as apostas\n3.Pesquisar apostas de um time\n4.Sair\n");
            if (opcao.equals("1")){
                String nomeTimeA = IO.readln("Nome do primeiro time:\n");
                int golsTimeA = Integer.parseInt(IO.readln("Quantos gols fará o "+nomeTimeA+"\n"));
                String nomeTimeB = IO.readln("Nome do segundo time:\n");
                int golsTimeB = Integer.parseInt(IO.readln("Quantos gols fará o "+nomeTimeB+"\n"));
                try {
                    sistema.cadastrarAposta(nomeTimeA, nomeTimeB, golsTimeA, golsTimeB);
                    IO.println("Aposta cadastrada com sucesso");
                } catch(ApostaJaExisteException e){
                    IO.println("Erro no sistema. Tente mais tarde");
                    e.printStackTrace();
                }
            } else if (opcao.equals("2")){
                List<ApostaDeJogo> listaApostas =  sistema.pesquisarTodasAsApostas();
                if (listaApostas.isEmpty()){
                    IO.println("Nenhuma aposta cadastrada");
                } else {
                    IO.println("Apostas encontradas:");
                    for (ApostaDeJogo aposta : listaApostas) {
                        IO.println(aposta.toString());
                    }
                }
            } else if (opcao.equals("3")){
                String nomeDoTime = IO.readln("Qual o nome do time a pesquisar?");
                List<ApostaDeJogo> listaApostasTime = sistema.pesquisaApostasEmTime(nomeDoTime);
                if (listaApostasTime.isEmpty()){
                    IO.println("Não existe nenhuma aposta para o time "+ nomeDoTime);
                } else {
                    IO.println("Apostas encontradas:");
                    for (ApostaDeJogo aposta : listaApostasTime) {
                        IO.println(aposta.toString());
                    }
                }
            } else if (opcao.equals("4")){
                IO.println("Até mais. Programa encerrado.");
                continuar = false;
            }
        }
    }

}
