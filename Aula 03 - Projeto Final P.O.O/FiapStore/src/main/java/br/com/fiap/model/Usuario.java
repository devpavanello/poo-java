package br.com.fiap.model;

import br.com.fiap.util.CriptografiaUtils;

public class Usuario 
{
	//Atributos
	private String email;
	private String senha;
	
	//Construtor Vazio 
	public Usuario()
	{
			
	}
	
	//Construtor 
	public Usuario(String email, String senha)
	{
		this.email = email;
		setSenha(senha);
	}
	
	//Getters and Setters 
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
