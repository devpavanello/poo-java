package repostory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import model.Usuario;

public class UsuarioDAO 
{
	private Connection conexao;
	
	public UsuarioDAO() throws SQLException
	{
		this.conexao = ConnectionFactory.conectar();
	}
	
	//Método de inserir usuarios no BD
	//Inserindo um Usuario
	public void insert(Usuario usuario) throws SQLException
	{
		//A string sql recebe o comando que será utilizado para inserir um usuario na tabela.
		//Em values voce necessita colocar a mesma quantidade de ponto de interrogação que atributos. Pois não sabemos o valor que irá receber.
		String sql = "insert into usuarios(nome, email, senha, data) values(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		//Finalizando o statement com dados do usuario
		stmt.setString(1,usuario.getNome());
		stmt.setString(2,usuario.getEmail());
		stmt.setString(3,usuario.getSenha());
		stmt.setDate(4,usuario.getData());
		
		stmt.execute();
		stmt.close();
	}
	
	//Método Update 
	public void update(Usuario usuario) throws SQLException
	{
		String sql = "update usuarios set nome=?, email=?, senha=? where id=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getSenha());
		stmt.setInt(4, usuario.getId());
		
		stmt.execute();
		stmt.close();
	}
	
	//Método Delete
	public void delete(int id) throws SQLException
	{
		String sql = "delete from usuarios where id=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
	}
	
	//Método de Select
	public List<Usuario> selectAll() throws SQLException
	{
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "select * from usuarios";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		//Ele guarda os dados da tabela.
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next())
		{
			Usuario usuario = new Usuario();
			usuario.setId(rs.getInt("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setData(rs.getDate("data"));
			
			usuarios.add(usuario);
		}
		rs.close();
		stmt.close();
		return usuarios;
	}
	
	public Usuario selectById(int id) throws SQLException
	{
		Usuario usuario = null;
		String sql = "select * from usuarios where id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next())
		{
			usuario = new Usuario();
			usuario.setId(rs.getInt("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setData(rs.getDate("data"));		
		}
		rs.close();
		stmt.close();
		return usuario;
	
	}
}
