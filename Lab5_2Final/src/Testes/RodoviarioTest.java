package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contribuintes.Rodoviario;

class RodoviarioTest {

	Rodoviario rodoviario1;
	Rodoviario rodoviario2;
	float desconto1, desconto2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		rodoviario1 = new Rodoviario(1200);
		rodoviario2 = new Rodoviario(1560);
		desconto1 = rodoviario1.getDesconto();
		desconto2 = rodoviario2.getDesconto();
	}
	
	@Test
	void test1() {
		assertEquals(12, desconto1);
	}
	
	@Test
	void test2() {
		assertEquals(15,6, desconto2);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
