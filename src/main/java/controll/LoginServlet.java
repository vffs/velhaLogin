package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;

import java.util.List;
import java.util.ArrayList;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;

	public LoginServlet() {		
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Katarina","123456","katarina@gmail.com"));
		usuarios.add(new Usuario("Pedro","123456","pedro@gmail.com"));
		usuarios.add(new Usuario("Joao","123456","joao@gmail.com"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("eml");
		String senha = request.getParameter("psw");
				
		for(Usuario user: usuarios) {
			if(user.getEmail().equals(email) && user.getSenha().equals(senha)) {
				request.setAttribute("user", user);			
				request.setAttribute("nameUser", user.getNome());
			}		
			
		}
		
		if(request.getAttribute("user") != null) {
			
			request.getRequestDispatcher("/logado.jsp").forward(request, response);
		}
		else {
			request.setAttribute("falhalogin", "Falhou");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		}
		
	}

}
