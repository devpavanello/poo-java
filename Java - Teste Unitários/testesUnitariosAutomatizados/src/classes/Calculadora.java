package classes;

/**@Author Enzo Pavanello*
 * @version 1.0*/
public class Calculadora
{
	//Atributos
	private double soma; 
	private double sub;
	private double div;
	private double mult;
	private double pot;
	private double raiz;
	
	//Métodos
	public void somar(double valor1, double valor2)
	{
		this.soma = valor1 + valor2;
	}
	
	public void subtrair(double valor1, double valor2)
	{
		this.soma = valor1 - valor2;
	}
	
	public void dividir(double valor1, double valor2)
	{
		this.soma = valor1 / valor2;
	}
	
	public void multiplicar(double valor1, double valor2)
	{
		this.soma = valor1 * valor2;
	}
	
	public void pot(double valor1, double valor2)
	{
		this.soma = Math.pow(valor1, valor2);
	}
	
	public void raiz(double valor1)
	{
		this.soma = Math.sqrt(valor1);
	}

	//Getters
	public double getSoma() 
	{
		return soma;
	}

	public double getSub() 
	{
		return sub;
	}

	public double getDiv() 
	{
		return div;
	}

	public double getMult() 
	{
		return mult;
	}

	public double getPot()
	{
		return pot;
	}

	public double getRaiz() 
	{
		return raiz;
	}
}

