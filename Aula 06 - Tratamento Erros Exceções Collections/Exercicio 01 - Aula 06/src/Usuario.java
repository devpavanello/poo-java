
public class Usuario implements Comparable<Usuario>
{
	private int idUsuario;
	private String nome;
	private String senha;
	
	
	public Usuario(int idUsuario, String nome, String senha)
	{
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}
	
	//Comparação entre objetos
	public int compareTo(Usuario user)
	{
		if(this.getIdUsuario() < user.getIdUsuario())
		{
			return -1;
		}
		
		if(this.getIdUsuario() > user.getIdUsuario())
		{
			return 1;
		}
		
		return 0;
	}
	


	public int getIdUsuario() 
	{
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) 
	{
		this.idUsuario = idUsuario;
	}


	public String getNome()
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public String getSenha() 
	{
		return senha;
	}


	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
	
	
	
	
	
	
}
