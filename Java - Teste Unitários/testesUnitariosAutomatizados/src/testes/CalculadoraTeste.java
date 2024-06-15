package testes;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import classes.Calculadora;

public class CalculadoraTeste 
{
	//Instanciando o objeto calculadora
	Calculadora calculadora = new Calculadora();
	
	@Test
	public void testeSomar()
	{
		//Evocando o método somar
		calculadora.somar(3, 2);
		//Teste compara valor esperado com valor calculado
		Assertions.assertEquals(5, calculadora.getSoma());
	}
	
	public void testeSubtrair()
	{
		calculadora.subtrair(5, 2);
		Assertions.assertEquals(5, calculadora.getSoma());
	}
	
	public void testeDivisao()
	{
		calculadora.dividir(10, 2);
		Assertions.assertEquals(5, calculadora.getSoma());
	}
	
	public void testeMultiplicar()
	{
		calculadora.multiplicar(7, 5);
		Assertions.assertEquals(35, calculadora.getSoma());
	}
	
	public void testePot()
	{
		calculadora.pot(3, 2);
		Assertions.assertEquals(9, calculadora.getSoma());
	}
	
	public void testeRaiz()
	{
		calculadora.raiz(25);
		Assertions.assertEquals(5, calculadora.getSoma());
	}
}
