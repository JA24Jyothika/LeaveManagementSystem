package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import com.hexaware.leavemanagementsystemproject.dto.LeaveTypeDTO;
import com.hexaware.leavemanagementsystemproject.entities.LeaveType;



public interface ILeaveTypeService {
	 public LeaveType insertLeaveType(LeaveTypeDTO leaveTypeDTO);
	    public LeaveType updateLeaveType(LeaveTypeDTO leaveTypeDTO);
	    public LeaveTypeDTO getLeaveTypeByName(String leaveTypeName);
	    public List <LeaveType> getAllLeaveTypes();
	    
}
