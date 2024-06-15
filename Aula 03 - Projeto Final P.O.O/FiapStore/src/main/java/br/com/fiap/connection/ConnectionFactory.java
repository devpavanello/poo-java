package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory
{
	private static ConnectionFactory connectionManager;
	
	private ConnectionFactory()
	{
		
	}
	
	//Singleton
	//Ele garante uma única instancia da classe
	public static ConnectionFactory getInstance()
	{
		if(connectionManager == null)
		{
			connectionManager = new ConnectionFactory();
		}
		return connectionManager;
	}
	
	//Método que devolve a conexão com o banco de dados
	public Connection getConnection()
	{
		Connection connection = null;
		
		try
		{
			//Registro do driver
			Class.forName("oracle.jdbc.drive.OracleDriver");
			//Endereço do banco de dados 
			connection = DriverManager.getConnection("jdbc:oracle:thin@oracle.fiap.com.br:1521:ORCL", "rm93345", "071103");
		}catch (Exception e)
		{
			//Rota do erro na conexão do banco de dados
			e.printStackTrace();
		}
		
		return connection;
	}
}
