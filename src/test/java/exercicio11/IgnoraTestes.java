package exercicio11;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoraTestes {
	
	@Test
	public void teste1() {
		assertTrue(true);
	}
	
	@Test
	@Ignore
	public void testeIgnorado() {
		
	}
	
	@Test
	@Ignore(value = "Teste ignorado pelo motivo XPTO")
	public void testeIgnorado_ComMotivo() {
		
	}
	

}
