package teste;
import java.sql.SQLException;
import java.util.List;

import model.Usuario;
import repostory.UsuarioDAO;

public class Teste 
{
	public static void main(String[] args) throws SQLException
	{
		//Instanciando objeto
		UsuarioDAO dao = new UsuarioDAO();
		
		//Inserindo usuarios
		Usuario enzo = new Usuario("Enzo", "enzo@gmail.com", "123456");
		Usuario vitor = new Usuario("Vitor", "vitor@gmail.com", "56789");
		dao.insert(enzo);
		dao.insert(vitor);
		
		//Executando o método update
		//enzo.setNome("Enzo Pavanello");
		//dao.update(enzo);
		
		//Executando o método delete
		//dao.delete(1);
		

		
		/*
		List<Usuario> lista = dao.selectAll();
		
		for(Usuario usuario: lista)
		{
			System.out.println("ID: "+ usuario.getId());
			System.out.println("Nome: "+ usuario.getNome());
			System.out.println("E-mail: "+ usuario.getEmail());
			System.out.println("Senha: "+ usuario.getSenha());
			System.out.println("Data de registro: "+ usuario.getData());
			System.out.println();
		}
		*/
		
		Usuario usuario = dao.selectById(1);
		System.out.println(usuario.getId());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getData());
	}
}
