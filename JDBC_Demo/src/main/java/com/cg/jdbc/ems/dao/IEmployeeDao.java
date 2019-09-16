/**
 * 
 */
package com.cg.jdbc.ems.dao;
import java.math.BigInteger;
import java.util.List;

import com.cg.jdbc.ems.exception.EmployeeException;
import com.cg.jdbc.ems.model.Employee;

/**
 * @author User
 *
 */
public interface IEmployeeDao {
	
	public Employee addEmployee(Employee employee) throws EmployeeException;
    public List<Employee> listAllEmployees() throws EmployeeException;
   /* public Employee updateEmployee(Employee employee) throws EmployeeException;
    public Employee deleteEmployee(BigInteger empId) throws EmployeeException;
    public Employee findByEmpId(BigInteger empId ) throws EmployeeException;*/
}
