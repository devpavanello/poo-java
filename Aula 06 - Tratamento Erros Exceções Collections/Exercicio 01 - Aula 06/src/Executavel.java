import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Executavel {

	public static void main(String[] args) 
	{
		Usuario jose = new Usuario(1, "José", "Admin");
		Usuario maria = new Usuario(2, "Maria", "Admin");
		Usuario vitor = new Usuario(3, "Vitor", "Admin");
		Usuario nicole = new Usuario(4, "Nicole", "Admin");
		Usuario bruna = new Usuario(5, "Bruna", "Admin");
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(bruna);
		listaUsuarios.add(nicole);
		listaUsuarios.add(vitor);
		listaUsuarios.add(maria);
		listaUsuarios.add(jose);
		
		
		for(Usuario usuario: listaUsuarios)
		{
			System.out.println(usuario.getNome());
		}
		
		Collections.sort(listaUsuarios);
		System.out.println("----Lista Ordenada----");
		
		for(Usuario usuario: listaUsuarios)
		{
			System.out.println(usuario.getNome());
		}
		
		Map mapa = new HashMap();
		
		mapa.put("1", jose);
		mapa.put("2", maria);
		mapa.put("3", vitor);
		mapa.put("4", nicole);
		mapa.put("5", bruna);
		
		for(int i = 0; i < mapa.size(); i++)
		{
			Usuario usuario = (Usuario) mapa.get(Integer.toString(i));
			System.out.println(usuario.getNome());
		}
	}

}
