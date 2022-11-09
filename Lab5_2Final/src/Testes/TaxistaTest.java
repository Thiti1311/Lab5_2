package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Taxista;

class TaxistaTest {
	
	Taxista taxista1;
	Taxista taxista2;
	float tributos1, tributos2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//(String nome, int numId, int numPassageirosAnuais, float kmPercorridos)
		taxista1 = new Taxista("Renan", 0, 800, 600);
		taxista2 = new Taxista("Thiago", 1, 350, 400);
		tributos1 = taxista1.tributos();
		tributos2 = taxista2.tributos();
	}
	
	@Test
	void test1() {
		assertEquals(394, tributos1);
	}
	
	@Test
	void test2() {
		assertEquals(171, tributos2);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
