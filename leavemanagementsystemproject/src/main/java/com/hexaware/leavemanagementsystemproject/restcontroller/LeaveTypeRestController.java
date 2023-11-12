package com.hexaware.leavemanagementsystemproject.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.leavemanagementsystemproject.dto.LeaveTypeDTO;
import com.hexaware.leavemanagementsystemproject.entities.LeaveType;
import com.hexaware.leavemanagementsystemproject.service.LeaveTypeServiceImp;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/leavetype")
public class LeaveTypeRestController {
	@Autowired
	LeaveTypeServiceImp leaveTypeService;
	@PostMapping(value="/addleavetype")
	public LeaveType insertLeaveType(@Valid @RequestBody LeaveTypeDTO leaveTypeDTO)
	{
		return leaveTypeService.insertLeaveType(leaveTypeDTO);
	}
	@PutMapping(value="/updateleavetype")
	public LeaveType updateLeaveType(@RequestBody LeaveTypeDTO leaveTypeDTO)
	{
		return leaveTypeService.updateLeaveType(leaveTypeDTO);
	}
	@GetMapping(value="/get/{leaveTypeName}")
	public  LeaveTypeDTO getLeaveTypeByName(@PathVariable String leaveTypeName)
	{
		  return leaveTypeService.getLeaveTypeByName(leaveTypeName);
		 
	}
	@GetMapping(value="/getleavetypes")
	public List<LeaveType> getAllLeaveTypes()
	{
		return leaveTypeService.getAllLeaveTypes();
	}
}
