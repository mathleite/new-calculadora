package br.com.db1.start.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.matematica.Divisao;
import br.com.db1.start.matematica.ICalcula;
import br.com.db1.start.matematica.Multiplicacao;
import br.com.db1.start.matematica.Soma;
import br.com.db1.start.matematica.Subtracao;



public class OperadoresTeste {

	@Test
	public void calcularTeste(){
		
		ICalcula operacao = new Soma();
		Assert.assertTrue(32 == operacao.soma(30d, 2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(28 ==operacao.soma(30d, 2d));
		
		operacao = new Multiplicacao();
		Assert.assertTrue(60 == operacao.soma(30d, 2d));
		
		operacao = new Divisao();
		Assert.assertTrue(15 == operacao.soma(30d, 2d));
	}
}
