package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreCondicaoDaClasse {
	@BeforeClass
	public static void befClass() {
		System.out.println("Executou a Pré Condição da Classe");
	}
	@Before
	public void setUp() {
		System.out.println("Executou a Pré Condição");
	}

	@Test
	public void testePreEPosCondicao_Teste1() {
		System.out.println("Executou o Teste 1");
	}

	@Test
	public void testePreEPosCondicao_Teste2() {
		System.out.println("Executou o Teste 2");
	}

	@After
	public void tearDown() {
		System.out.println("Executou Pós Condição");
	}
	
	@AfterClass
	public static void aftClass() {
		System.out.println("Executou a Pós Condição da Classe");
	}

}
