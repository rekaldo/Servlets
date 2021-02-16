package com.nowe.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundo
 */
@WebServlet("/holamundo")
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Inicializar el tipo de respuesta
		  response.setContentType("text/html;charset=UTF-8");
		  // 2. Hacer una referencia con el PrintWriter hacia la respuesta
		  // es decir se va escribir en la respuesta
		  PrintWriter respuesta = response.getWriter();
		  respuesta.println("<html>" + "<head>" + "<title>Hola mundo</title>" + "</head>" + "<body>"
		    + "<h1>Hola Mundo</h1>" + "</body>" + "</html>");
		  respuesta.close();
		
	}

}
