package exercicio3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidacaoIgualdade {
	@Test
	public void validacaoIgualdade_Sucesso() {
		String mensagem = "Registro salvo com sucesso!";
		assertEquals("Registro salvo com sucesso!",mensagem);
	}
	
	@Test
	public void validacaoIgualdade_Falha() {
		String mensagem = "Registro Excluído com sucesso!";
		assertEquals("Registro Removido com sucesso!",mensagem);
	}
}
