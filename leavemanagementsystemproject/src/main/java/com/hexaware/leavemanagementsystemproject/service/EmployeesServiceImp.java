package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.leavemanagementsystemproject.dto.EmployeesDTO;
import com.hexaware.leavemanagementsystemproject.entities.Employees;
import com.hexaware.leavemanagementsystemproject.repository.EmployeesRepository;
@Service
public class EmployeesServiceImp implements IEmployeesService {
    @Autowired
    EmployeesRepository employeesRepo;
	@Override
	public Employees insertEmployees(EmployeesDTO employeesDTO) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Employees employees=new Employees();
				employees.setEmployeeID(employeesDTO.getEmployeeID());
				employees.setEmail(employeesDTO.getEmail());
				employees.setFirstName(employeesDTO.getFirstName());
				employees.setLastName(employeesDTO.getLastName());
				employees.setPassword(employeesDTO.getPassword());
				employees.setRole(employeesDTO.getRole());
				return employeesRepo.save(employees);
	}

	@Override
	public Employees updateEmployees(EmployeesDTO employeesDTO) {
		// TODO Auto-generated method stub
		Employees employees=new Employees();
		employees.setEmployeeID(employeesDTO.getEmployeeID());
		employees.setEmail(employeesDTO.getEmail());
		employees.setFirstName(employeesDTO.getFirstName());
		employees.setLastName(employeesDTO.getLastName());
		employees.setPassword(employeesDTO.getPassword());
		employees.setRole(employeesDTO.getRole());
		return employeesRepo.save(employees);
	}

	@Override
	public EmployeesDTO getByID(Long employeeID) {
		// TODO Auto-generated method stub
		EmployeesDTO employeesDTO=new EmployeesDTO();
		Employees employees=employeesRepo.findById(employeeID).orElse(new Employees());
	
		employeesDTO.setEmployeeID(employees.getEmployeeID());
		employeesDTO.setEmail(employees.getEmail());
		employeesDTO.setFirstName(employees.getFirstName());
		employeesDTO.setLastName(employees.getLastName());
		employeesDTO.setPassword(employees.getPassword());
		employeesDTO.setRole(employees.getRole());
		return employeesDTO;
	}

	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub
		return employeesRepo.findAll();
	}

	@Override
	public void deleteEmployeeByID(Long employeeID) {
		// TODO Auto-generated method stub
		employeesRepo.deleteById(employeeID);;
	}

}
