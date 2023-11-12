package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.leavemanagementsystemproject.dto.LeaveTypeDTO;
import com.hexaware.leavemanagementsystemproject.entities.LeaveType;
import com.hexaware.leavemanagementsystemproject.repository.LeaveTypeRepository;
@Service
public class LeaveTypeServiceImp implements ILeaveTypeService {
	@Autowired
LeaveTypeRepository leaveTypeRepo;
	@Override
	public LeaveType insertLeaveType(LeaveTypeDTO leaveTypeDTO) {
		// TODO Auto-generated method stub
		LeaveType leaveType=new LeaveType();
		leaveType.setLeaveTypeId(leaveTypeDTO.getLeaveTypeId());
		leaveType.setLeaveTypeName(leaveTypeDTO.getLeaveTypeName());
		leaveType.setLeaveLimit(leaveTypeDTO.getLeaveLimit());
		return leaveTypeRepo.save(leaveType);
	}

	@Override
	public LeaveType updateLeaveType(LeaveTypeDTO leaveTypeDTO) {
		// TODO Auto-generated method stub
		LeaveType leaveType=new LeaveType();
		leaveType.setLeaveTypeId(leaveTypeDTO.getLeaveTypeId());
		leaveType.setLeaveTypeName(leaveTypeDTO.getLeaveTypeName());
		leaveType.setLeaveLimit(leaveTypeDTO.getLeaveLimit());
		return leaveTypeRepo.save(leaveType);
	}
	@Override
	public LeaveTypeDTO getLeaveTypeByName(String leaveTypeName) {
	LeaveTypeDTO leaveTypeDTO = new LeaveTypeDTO();
     LeaveType leaveType = leaveTypeRepo.findByLeaveTypeName(leaveTypeName);

    
   
        leaveTypeDTO.setLeaveTypeId(leaveType.getLeaveTypeId());
        leaveTypeDTO.setLeaveTypeName(leaveType.getLeaveTypeName());
        leaveTypeDTO.setLeaveLimit(leaveType.getLeaveLimit());
    
    

    return leaveTypeDTO;
	}

	@Override
	public List<LeaveType> getAllLeaveTypes() {
		// TODO Auto-generated method stub
		return leaveTypeRepo.findAll();
	}

}
