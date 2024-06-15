package model;

import java.sql.Date;

public class Produtos 
{
	//Atributos
	private int ID;
	private String nome;
	private double preco;
	private String descricao;
	private Date data_cadastro;
	private int categoria_id;
	
	//Construtor
	public Produtos(int iD, String nome, double preco, String descricao, Date data_cadastro, int categoria_id) 
	{
		ID = iD;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.data_cadastro = data_cadastro;
		this.categoria_id = categoria_id;
	}

	//Construtor vazio
	public Produtos() 
	{

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

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco) 
	{
		this.preco = preco;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public Date getData_cadastro()
	{
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro)
	{
		this.data_cadastro = data_cadastro;
	}

	public int getCategoria_id() 
	{
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id)
	{
		this.categoria_id = categoria_id;
	}
}
