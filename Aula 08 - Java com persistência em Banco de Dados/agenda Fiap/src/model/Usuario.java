package model;

import java.sql.Date;

import br.com.fiap.util.CriptografiaUtils;

//Javabeans
public class Usuario 
{
	private int id;
	private String nome;
	private String email;
	private String senha;
	//O objeto date já foi instanciado no momento da sua criação para pegar o dia de acordo com o sistema operacional.
	private Date data = new Date(System.currentTimeMillis());
	
	//Construtor Vazio
	public Usuario()
	{
		
	}

	//Construtor dos objetos
	public Usuario(String nome, String email, String senha) 
	{
		this.nome = nome;
		this.email = email;
		setSenha(senha);
	}
	
	//Getters / Setters
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getSenha() 
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		try
		{
			this.senha = CriptografiaUtils.criptografar(senha);			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public Date getData()
	{
		return data;
	}

	public void setData(Date data) 
	{
		this.data = data;
	}	
}
