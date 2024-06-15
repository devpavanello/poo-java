package br.com.fiap.filter;

import java.io.IOException;

//Lembrar de colocar o TomCat no projeto
@WebFilter("/*")
public class LoginFilter extends HttpFilter implements Filter
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String url = req.getResquestURI();
		
		if(session.getAttribute("user") == null && !url.endsWith("login") && !url.contains("resources") && !url.contains("home"))
		{
			request.setAttribute("erro", "Entre com o usuário e senha!");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else
		{
			chain.doFilter(request,response);
		}
	}
}
