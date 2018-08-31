package exercicio4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEPosCondicaoDeTeste {
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

}
