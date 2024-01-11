package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import com.demo.model.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;



@WebServlet("/employees")
public class DisplayEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService eservice = new EmpServiceImpl();
		List<Employee> elist = eservice.findAllEmployees();
		request.setAttribute("list", elist);
		RequestDispatcher rd = request.getRequestDispatcher("displayemp.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
