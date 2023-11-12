package com.hexaware.leavemanagementsystemproject.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class LeaveType {

    @Id
  
    private Long leaveTypeId;

    
    private String leaveTypeName;

    private int leaveLimit;
    
    @OneToMany(mappedBy="leaveType")
    private List <LeaveRequest> leaverequest;
    
    @OneToMany(mappedBy="leaveType")
    private List <LeaveBalances> leaveBalances;

	
	


	public LeaveType(Long leaveTypeId, String leaveTypeName, int leaveLimit) {
		super();
		this.leaveTypeId = leaveTypeId;
		this.leaveTypeName = leaveTypeName;
		this.leaveLimit = leaveLimit;
	}





	public Long getLeaveTypeId() {
		return leaveTypeId;
	}





	public void setLeaveTypeId(Long leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}





	public String getLeaveTypeName() {
		return leaveTypeName;
	}





	public void setLeaveTypeName(String leaveTypeName) {
		this.leaveTypeName = leaveTypeName;
	}





	public int getLeaveLimit() {
		return leaveLimit;
	}





	public void setLeaveLimit(int leaveLimit) {
		this.leaveLimit = leaveLimit;
	}





	public LeaveType() {
		super();
	}

	
	
    
}

