package Exercicio_03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class NumInsert 
{

	public static void main(String[] args) 
	{
		ArrayList listaInt = new ArrayList();
		//HashSet listaInt = new HashSet();
		//LinkedList listaInt = new LinkedList();

		long ini = System.currentTimeMillis();
		System.out.println(ini);
		

		for (int i = 0; i <= 10000000; i++) 
		{
			listaInt.add(i);
		}
		
		long fim = System.currentTimeMillis();
		System.out.println(fim);

		long tempo = fim - ini;

		System.out.println(tempo);
	}
}
