
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bemvindo")
public class PrimeiraServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	//Construtor vazio
    public PrimeiraServlet() 
    {
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html> ");
		out.println("<head> ");
		out.println("<title>FIAP</title> ");
		out.println("</head> ");
		out.println("<body> ");
		out.println("<b> Bem vindo !!! </b>");
		out.println("</body> ");
		out.println("</html> ");
	}

}
