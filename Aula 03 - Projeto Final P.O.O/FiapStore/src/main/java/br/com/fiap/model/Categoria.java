package br.com.fiap.model;

public class Categoria 
{
	//Atributos 
	private int codigo; 
	private String nome;
	
	//Construtor vazio
	public Categoria() 
	{
		
	}

	//Construtor 
	public Categoria(int codigo, String nome) 
	{
		this.codigo = codigo;
		this.nome = nome;
	}

	//Getters and Setters 
	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
}
