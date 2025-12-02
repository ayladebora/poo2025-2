package br.ufpb.dcx.ayla.roupas;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SistemaLojaRoupasPOOTest {

    @Test
    public void testaCadastroDeRoupa(){
        SistemaLojaRoupasPOO sistema = new SistemaLojaRoupasPOO();
        try {
            sistema.cadastraRoupa("001", "Camisa polo Azul Masculina",
                    Tamanho.M, 10);
            Roupa r = sistema.pesquisaRoupa("001");
            assertEquals(10, r.getQuantidade());

            sistema.cadastraRoupa("002", "Camisa vermelha feminina", Tamanho.M,
                    2);
            List<Roupa> roupasCamisa = sistema.pesquisaRoupasComDescricaoComecandoCom("Camisa");
            assertEquals(2, roupasCamisa.size());

            sistema.alteraQuantidadeDeRoupaNoEstoque("001", 9);
            int quantidade = sistema.pesquisaQuantidadeDeRoupaNoEstoque("001");
            assertTrue(quantidade == 9);



        } catch (RoupaJaExisteException | RoupaInexistenteException e ){
            fail("Não deveria lançar exceção");
        }
    }
}
