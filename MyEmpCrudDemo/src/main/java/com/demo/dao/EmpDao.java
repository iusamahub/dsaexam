package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {

	List<Employee> findAllEmployees();

	void addNewEmp(Employee e);

	Employee getById(int empid);

	void updateById(Employee e);

	void removeById(int empid);

}
