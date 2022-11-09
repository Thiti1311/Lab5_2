package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Caminhoneiro;

class CaminhoneiroTest {
	
	Caminhoneiro caminhoneiro1;
	Caminhoneiro caminhoneiro2;
	float tributos1, tributos2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		//String nome, int numId, float toneladasTransportadas, float kmPercorridos
		caminhoneiro1 = new Caminhoneiro("Renan", 0, 3, 85);
		caminhoneiro2 = new Caminhoneiro("Thiago", 1, 11, 15);
		tributos1 = caminhoneiro1.tributos();
		tributos2 = caminhoneiro2.tributos();
	}

	@Test
	void test1() {
		assertEquals(499,15, tributos1);
	}
	
	@Test
	void test2() {
		assertEquals(499,15, tributos2);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
