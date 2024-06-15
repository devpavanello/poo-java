package model;

public class ItensPedidos 
{
	//Atributos
	private int ID;
	private int quantidade;
	private double preco_unit;
	private int pedido_id;
	private int produto_id;
	
	//Construtor
	public ItensPedidos(int iD, int quantidade, double preco_unit, int pedido_id, int produto_id) 
	{
		ID = iD;
		this.quantidade = quantidade;
		this.preco_unit = preco_unit;
		this.pedido_id = pedido_id;
		this.produto_id = produto_id;
	}
	
	//Construtor vazio
	public ItensPedidos() 
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

	public int getQuantidade() 
	{
		return quantidade;
	}

	public void setQuantidade(int quantidade) 
	{
		this.quantidade = quantidade;
	}

	public double getPreco_unit() 
	{
		return preco_unit;
	}

	public void setPreco_unit(double preco_unit) 
	{
		this.preco_unit = preco_unit;
	}

	public int getPedido_id() 
	{
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) 
	{
		this.pedido_id = pedido_id;
	}

	public int getProduto_id() 
	{
		return produto_id;
	}

	public void setProduto_id(int produto_id)
	{
		this.produto_id = produto_id;
	}
}
