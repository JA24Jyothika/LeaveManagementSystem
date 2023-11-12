package com.hexaware.leavemanagementsystemproject.dto;

import jakarta.validation.constraints.Max;

public class LeaveTypeDTO {
private Long leaveTypeId;
private String leaveTypeName;
@Max(30)
private int leaveLimit;


public LeaveTypeDTO(Long leaveTypeId, String leaveTypeName, @Max(30) int leaveLimit) {
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


public LeaveTypeDTO() {
	super();
}

}
