package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Medico;
import Contribuintes.Taxista;
import Main.ReceitaFederal;
import Main.Opcao2;

class Opcao2Test {

	ReceitaFederal receita;
	Taxista taxista;
	Medico medico;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		receita = new ReceitaFederal();
		receita.criarTaxista("Thiago", 74, 520);
		taxista = new Taxista("Thiago", 0, 74, 520);
		receita.criarMedico("Ana", 42, 1200);
		medico = new Medico("Ana", 1, 42, 1200);
	}
	
	@Test
	void test1() {
		assertEquals(taxista.getClass(), Opcao2.escolha2(receita, 1).getClass());
	}
	
	@Test
	void test2() {
		assertEquals(medico.getClass(), Opcao2.escolha2(receita, 2).getClass());
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
