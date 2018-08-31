package exercicio10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import votacao.Votacao;

@RunWith(JUnitParamsRunner.class)
public class ValidarIdadePorVotacao_CSV {
	@Parameter(0) public String nome;
	@Parameter(1) public int anoDeNascimento;
	@Parameter(2) public String resultado;
	
	@Test
	@FileParameters(value = "src/test/resources/dados.csv", mapper = CsvWithHeaderMapper.class)
	public void validarObrigatoriedaDeDeVoto(String nome, int anoDeNascimento, String resultado) {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}

}
