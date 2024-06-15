package br.com.fiap.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CriptografiaUtils 
{
	public static String criptografar(String senha)
	{
		MessageDigest md;
		try
		{
		//Instancia de um algoritmo
		md = MessageDigest.getInstance("MD5");
		
		//Passo os dados a serem criptografados e estipula o encoding padrão
		md.update(senha.getBytes("ISO-8859-1"));
		
		//Gera a chave criptografada para posterior hashing 
		BigInteger hash = new BigInteger(1, md.digest());
		
		//Retorna a senha criptografada
		return hash.toString(16);
		}catch (NoSuchAlgorithmException | UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
	}
}
