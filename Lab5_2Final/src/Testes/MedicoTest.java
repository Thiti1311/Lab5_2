package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Medico;

class MedicoTest {

	Medico medico1, medico2;
	float tributos1, tributos2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		//String nome, int numId, int numPacientes, float despesasCongresso
		medico1 = new Medico("Renan", 0, 4, 85);
		medico2 = new Medico("Thiago", 1, 7, 115);
		tributos1 = medico1.tributos();
		tributos2 = medico2.tributos();
	}
	
	@Test
	void test1() {
		assertEquals(0, tributos1);
	}

	@Test
	void test2() {
		assertEquals(0, tributos2);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
