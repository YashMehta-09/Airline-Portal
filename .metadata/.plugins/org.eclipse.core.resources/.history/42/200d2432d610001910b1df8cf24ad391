package com.airline.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.dao.MySqlDAO;
import com.airline.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Logged Out");
		HttpSession session = request.getSession(false);
		session.invalidate();
		RequestDispatcher dispatch = request.getRequestDispatcher("Index.jsp");
		dispatch.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true);
		RequestDispatcher dispatch = null;
		
		User user = new User();
		MySqlDAO mySqlDAO = new MySqlDAO();
		
		
		String emailId = request.getParameter("email");
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");
		
		user.setEmailId(emailId);
		user.setPassword(password);
		user.setContact(contact);
		
		System.out.println(emailId);
		System.out.println(password);
		System.out.println(contact);
		
		
		
		if("Login".equals(request.getParameter("Login")))
		{
			System.out.println("Inside Login");
			boolean status = mySqlDAO.validate(user);
			System.out.println(status);
			if(status)
			{
				dispatch = request.getRequestDispatcher("views/main.jsp");
				session.setAttribute("user", user);
				dispatch.forward(request, response);
			}
			
			/*System.out.println(user.getEmailId());
			System.out.println(user.getPassword());
			System.out.println(user.getContact());*/
			
		}
		else if("Signup".equals(request.getParameter("Signup")))
		{
			System.out.println("Inside Signup");
			boolean status = mySqlDAO.create(user);
			System.out.println(status);
			if(status)
			{
				dispatch = request.getRequestDispatcher("views/main.jsp");
				session.setAttribute("user", user);
				dispatch.forward(request, response);
			}
			/*System.out.println(user.getEmailId());
			System.out.println(user.getPassword());
			System.out.println(user.getContact());*/
		}
	}

}
