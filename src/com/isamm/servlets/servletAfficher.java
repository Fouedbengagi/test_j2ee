package com.isamm.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isamm.services.livreServiceImplementation;

import comm.isamm.beans.livre;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servletAfficher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	livreServiceImplementation l=new livreServiceImplementation();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAfficher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		java.util.List<livre> livre=l.findAll();
		request.setAttribute("livres",livre);
		this.getServletContext().getRequestDispatcher("/afficherlisteJstl.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
