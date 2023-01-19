package com.groupeisi.microservices.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.groupeisi.microservices.entities.Users;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet(value="/users", name="users")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
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
		List<Users> users = new ArrayList<>();
		Users u1 = new Users(1, "Youssou","Ndiaye","ndiayeinf@gmail.com","passer@1");
		Users u2 = new Users(2, "Mohamed","Fall","Fallabd@gmail.com","passer1234");
		Users u3 = new Users(3, "Diams","Thiaw","DiamsT@gmail.com","passer987");
		users.add(u1);
		users.add(u2);
		users.add(u3);
		request.setAttribute("all_users", users);
		request
			.getRequestDispatcher("/WEB-INF/views/admin/users/all.jsp")
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
