package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;
import com.demo.model.Employee;

@WebServlet("/addnewemp")
public class AddNewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empid = Integer.parseInt(request.getParameter("empid"));
		String ename = request.getParameter("ename");
		double sal = Double.parseDouble(request.getParameter("sal"));
		EmpService eservice = new EmpServiceImpl();
		Employee e = new Employee(empid, ename, sal);
		eservice.addNewEmp(e);
		RequestDispatcher rd = request.getRequestDispatcher("employees");
		rd.forward(request, response);
	}

}
