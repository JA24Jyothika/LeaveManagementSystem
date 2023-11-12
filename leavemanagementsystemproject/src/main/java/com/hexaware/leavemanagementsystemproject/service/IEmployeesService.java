package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import com.hexaware.leavemanagementsystemproject.dto.EmployeesDTO;
import com.hexaware.leavemanagementsystemproject.entities.Employees;

public interface IEmployeesService {
 public Employees insertEmployees(EmployeesDTO employeesDTO);
 public Employees updateEmployees(EmployeesDTO employeesDTO);
 public EmployeesDTO getByID(Long employeeID);
 public List <Employees> getAll();
 public void deleteEmployeeByID(Long employeeID);
}
