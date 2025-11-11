package br.ufpb.dcx.ayla.apostas;

public class ProgramaDeApostasRT {

    void main(){
        SistemaDeApostas sistema = new SistemaDeApostas();
        boolean continuar = true;
        while(continuar){
            String opcao = IO.readln("Digite uma opção:\n1.Cadastrar aposta\n2.Pesquisar todas as apostas\n3.Pesquisar apostas de um time\n4.Sair");
            if (opcao.equals("1")){
                String nomeTimeA = IO.readln("Nome do primeiro time:\n");
                int golsTimeA = Integer.parseInt(IO.readln("Quantos gols fará o "+nomeTimeA));
                String nomeTimeB = IO.readln("Nome do segundo time:\n");
                int golsTimeB = Integer.parseInt(IO.readln("Quantos gols fará o "+nomeTimeB));
                try {
                    sistema.cadastrarAposta(nomeTimeA, nomeTimeB, golsTimeA, golsTimeB);
                } catch(ApostaJaExisteException e){
                    IO.println();
                }
            }
        }
    }

}
