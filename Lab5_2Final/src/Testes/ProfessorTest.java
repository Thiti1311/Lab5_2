package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Professor;

class ProfessorTest {

	Professor prof1;
	Professor prof2;
	float tributos1, tributos2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		//String nome, int numId, float numSalarios, float gastosMaterialDidatico
		prof1 = new Professor("Renan", 0, 1, 20);
		prof2 = new Professor("Thiago", 1, 4, 120);
		tributos1 = prof1.tributos();
		tributos2 = prof2.tributos();
	}

	@Test
	void test1() {
		assertEquals(50,60, tributos1);
	}
	
	@Test
	void test2() {
		assertEquals(61,20, tributos2);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
