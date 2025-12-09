package br.ufpb.dcx.professores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaGerenciaProfsMapTest {




    @Test
    public void testaCadastroProfessor(){
        SistemaGerenciaProfsMap sistema = new SistemaGerenciaProfsMap();
        try {
            sistema.cadastraProfessor(123, "Ayla");
            Professor p1 = sistema.pesquisaProfessor(123);
            assertEquals(123, p1.getMatricula());
            assertEquals("Ayla", p1.getNome());
        } catch (ProfessorJaExisteException | ProfessorInexistenteException e){
            fail("Não deveria lançar exceção");
        }

    }

}
