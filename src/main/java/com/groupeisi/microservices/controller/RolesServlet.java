package com.groupeisi.microservices.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.groupeisi.microservices.entities.Roles;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RolesServlet
 */
@WebServlet(value="/roles", name="roles")
public class RolesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RolesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Roles> roles = new ArrayList<>();
		Roles r1 = new Roles(1, "ROLE_USER");
		Roles r2 = new Roles(2, "ROLE_ADMIN");
		Roles r3 = new Roles(3, "ROLE_SUPER_ADMIN");
		roles.add(r1);
		roles.add(r2);
		roles.add(r3);
		request.setAttribute("all_roles", roles);
		request
			.getRequestDispatcher("/WEB-INF/views/admin/roles/all.jsp")
			.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
