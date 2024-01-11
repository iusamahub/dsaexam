package com.demo.service;

import java.util.List;

import com.demo.model.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;


public class EmpServiceImpl implements EmpService {
	
	private EmpDao edao;
	
	public EmpServiceImpl() {
		super();
		this.edao = new EmpDaoImpl();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return edao.findAllEmployees();
	}

	@Override
	public void addNewEmp(Employee e) {
		 edao.addNewEmp(e);
		
	}

	@Override
	public Employee getById(int empid) {
		
		return edao.getById(empid);
	}

	@Override
	public void modifyemp(Employee e) {
		edao.updateById(e);
		
	}
	
	@Override
	public void deleteById(int empid) {
		edao.removeById(empid);
		
	}

}
