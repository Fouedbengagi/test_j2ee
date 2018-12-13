package com.isamm.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isamm.services.livreServiceImplementation;

/**
 * Servlet implementation class rechercheServlet
 */
@WebServlet("/rechercheServlet")
public class rechercheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rechercheServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean trouve;
		String isbn = request.getParameter("isbn");
		livreServiceImplementation l=new livreServiceImplementation();
		trouve=l.FindOne(isbn);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/rechercherlivre.jsp");
		System.out.println(trouve);
		PrintWriter out= response.getWriter();
		if(trouve) {
		out.println("<font color=red>le livre existe.</font>");
		rd.include(request, response);}
		else
		{
			out.println("<font color=red>le livre n'existe pas.</font>");
		rd.include(request, response);
		}
	}

}
