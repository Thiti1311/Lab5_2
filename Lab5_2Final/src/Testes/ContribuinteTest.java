package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Bens.Bem;
import Contribuintes.Contribuinte;
import java.util.ArrayList;

class ContribuinteTest {
	
	Contribuinte contribuinte1;
	Contribuinte contribuinte2;
	ArrayList<Bem> bens1;
	ArrayList<Bem> bens2;
	Bem n1;
	Bem n2;
	Bem n3;
	Bem n4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		contribuinte1 = new Contribuinte("Renan", 0);
		contribuinte2 = new Contribuinte("Thiago",1);
		bens1 = new ArrayList<Bem>();
		bens2 = new ArrayList<Bem>();
		//Adicionando bens
		n1 = new Bem("Carro", 123);
		n2 = new Bem("Moto", 40);
		n3 = new Bem("Casa", 450);
		n4 = n3 = new Bem("Relógio", 4);
		bens1.add(n1);
		bens1.add(n2);
		bens1.add(n3);
		bens2.add(n1);
		bens2.add(n2);
		bens2.add(n3);
		bens2.add(n4);
		contribuinte1.setBens(bens1);
		contribuinte2.setBens(bens2);
	}
	
	//addBem
	@Test
	void test1() {
		assertEquals(bens1, contribuinte1.getBens());
	}
	
	@Test
	void test2() {
		assertEquals(bens2, contribuinte2.getBens());
	}
	
	//valorBens
	@Test
	void test3() {
		assertEquals(167, contribuinte1.valorBens());
	}
	
	@Test
	void test4() {
		assertEquals(171, contribuinte2.valorBens());
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
