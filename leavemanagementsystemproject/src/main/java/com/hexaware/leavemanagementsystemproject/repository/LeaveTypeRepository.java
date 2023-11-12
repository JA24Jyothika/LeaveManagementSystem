package com.hexaware.leavemanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.leavemanagementsystemproject.entities.LeaveType;


public interface LeaveTypeRepository extends JpaRepository<LeaveType,Long> {
	public LeaveType   findByLeaveTypeName(String leaveTypeName);
}
