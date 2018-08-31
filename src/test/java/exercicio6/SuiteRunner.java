package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVedadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicaoDeTeste;
import exercicio5.PreCondicaoDaClasse;

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class,
	ValidacaoVedadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicaoDeTeste.class,
	PreCondicaoDaClasse.class
})
public class SuiteRunner {

}
