package exercicio7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static votacao.Votacao.*;

public class ValidarIdadeParaVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voce nao pode votar", podeVotar("Maria", 2003));
	}
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto e facultativo", podeVotar("Rodrigo", 2002));
	}
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("Joao seu voto e facultativo", podeVotar("Joao", 2001));
	}
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		assertEquals("Carla seu voto e obrigatorio", podeVotar("Carla", 2000));
	}
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {
		assertEquals("Jose seu voto e obrigatorio", podeVotar("Jose", 1993));
	}
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Ana seu voto e obrigatorio", podeVotar("Ana", 1948));
	}
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		assertEquals("Pedro seu voto e facultativo", podeVotar("Pedro", 1947));
	}
	
}
