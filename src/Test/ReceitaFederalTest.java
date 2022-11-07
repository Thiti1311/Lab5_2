package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Contribuinte.Contribuinte;
import Contribuinte.Taxista;
import Main.ReceitaFederal;

public class ReceitaFederalTest {
    
    @Test
    void testCriarCaminhoneiro() {

    }

    @Test
    void testCriarMedico() {

    }

    @Test
    void testCriarProfessor() {

    }

    @Test
    void testCriarTaxista() {
        ReceitaFederal receita = new ReceitaFederal();
        Taxista taxi = receita.criarTaxista("Thiago", 10, 100);
        ArrayList<Contribuinte> n = receita.getContribuintes();
        assertEquals("Thiago", n.get(0).getNome());
    }

    @Test
    void testVerTributos() {

    }
}
