package model;

public class Categorias 
{
	//Atributos
	private int ID;
	private String nome;
	
	//Construtor
	public Categorias(int iD, String nome) 
	{
		ID = iD;
		this.nome = nome;
	}

	//Construtor vazio 
	public Categorias() 
	{
		super();
	}

	//Getters and Setters
	public int getID() 
	{
		return ID;
	}

	public void setID(int iD) 
	{
		ID = iD;
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
