package recursividade;

import java.util.Scanner;

public class Fatorial 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		long x;
		
		System.out.println("Informe o valor de X: ");
		x = teclado.nextLong();
		
		long f = x;
		while (x > 1)
		{
			f = f*(x - 1);
			x--;
		}
		
		System.out.println(f);
		
		teclado.close();

	}

}
