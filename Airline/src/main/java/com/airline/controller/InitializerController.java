package com.airline.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.bo.CityBO;
import com.airline.model.Cities;

/**
 * Servlet implementation class InitializerController
 */
public class InitializerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitializerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Initialize");
		CityBO cityBO = new CityBO();
		List<Cities> cityList  = cityBO.cityRecords();
		/*List<String> cityList = new ArrayList<String>();
		cityList.add("KOLKATA(CCU)");
		cityList.add("JAIPUR(JAI)");*/
		//cityList.add("MUMBAI(BOM)");
		
		RequestDispatcher dispatch = request.getRequestDispatcher("Index.jsp");
		request.setAttribute("citylist", cityList);
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
