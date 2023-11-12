package com.hexaware.leavemanagementsystemproject.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.leavemanagementsystemproject.dto.EmployeesDTO;
import com.hexaware.leavemanagementsystemproject.entities.Employees;
import com.hexaware.leavemanagementsystemproject.exceptions.EmployeeNotFoundException;
import com.hexaware.leavemanagementsystemproject.service.EmployeesServiceImp;


@RestController
@RequestMapping("/api/employees")
public class EmployeesRestController {
@Autowired
EmployeesServiceImp employeesService;
@PostMapping(value="/addemployee")
public Employees insertEmployees(@RequestBody EmployeesDTO employeesDTO)
{
	return employeesService.insertEmployees(employeesDTO);
}
@PutMapping(value="/updateemployee")
public Employees updateEmployees(@RequestBody EmployeesDTO employeesDTO)
{
	return employeesService.updateEmployees(employeesDTO);
}
@GetMapping(value="/getemployee/{employeeID}")
public EmployeesDTO getByID(@PathVariable Long employeeID) throws EmployeeNotFoundException
{
	EmployeesDTO employeesDTO= employeesService.getByID(employeeID);
	if(employeesDTO.getEmployeeID()==null) {
		throw new EmployeeNotFoundException(HttpStatus.BAD_REQUEST,"Employee Not found for employeeid"+employeeID);
     }
	return employeesDTO;
	
}
@GetMapping(value="/getAllEmployees")
public List<Employees> getAll()
{
	return employeesService.getAll();
}
@DeleteMapping(value="/deleteemployee/{employeeID}")
public void deleteEmployeeByID(@PathVariable Long employeeID)
{
  employeesService.deleteEmployeeByID(employeeID);
}
@ExceptionHandler({EmployeeNotFoundException.class})
public ResponseEntity <String>ProductException( EmployeeNotFoundException employeeexception)
{
	return new ResponseEntity<String>(employeeexception.getMessage(),HttpStatus.BAD_REQUEST);
}
}
