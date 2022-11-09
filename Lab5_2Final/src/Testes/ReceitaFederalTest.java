package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Caminhoneiro;
import Contribuintes.Medico;
import Contribuintes.Professor;
import Contribuintes.Taxista;
import Main.ReceitaFederal;

class ReceitaFederalTest {
	
	ReceitaFederal receita;
	Caminhoneiro caminhoneiro;
	Taxista taxista;
	Medico medico;
	Professor professor;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//Caminhoneiros String nome, float toneladasTransportadas, float kmPercorrido
		//Taxista String nome, int numPassageirosAnuais, float kmPercorridos
		//Medico String nome, int numPacientes, float despesasCongresso
		//Professor String nome, float numSalarios, float gastosMaterialDidatic
		receita = new ReceitaFederal();
		caminhoneiro = receita.criarCaminhoneiro("Renan", 11, 54);
		taxista = receita.criarTaxista("Thiago", 74, 520);
		medico = receita.criarMedico("Ana", 42, 1200);
		professor = receita.criarProfessor("Wallyson", 2, 420);
		
	}
	
	@Test
	void test1() {
		assertEquals(caminhoneiro.getClass(), receita.criarCaminhoneiro("Renan", 11, 54).getClass());
	}
	
	@Test
	void test2() {
		assertEquals(taxista.getClass(), receita.criarTaxista("Thiago", 74, 520).getClass());
	}
	
	@Test
	void test3() {
		assertEquals(medico.getClass(), receita.criarMedico("Ana", 42, 1200).getClass());
	}
	
	@Test
	void test4() {
		assertEquals(professor.getClass(), receita.criarProfessor("Wallyson", 2, 420).getClass());
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
