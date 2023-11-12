package com.hexaware.leavemanagementsystemproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class LeaveBalances {
    @Id
   
    private Long leaveBalanceID;

    @ManyToOne
    @JoinColumn(name = "employeeID")
    private Employees employee;

    @ManyToOne
    @JoinColumn(name = "leaveTypeID")
    private LeaveType leaveType;

    private int availableDays;

	public Long getLeaveBalanceID() {
		return leaveBalanceID;
	}

	public void setLeaveBalanceID(Long leaveBalanceID) {
		this.leaveBalanceID = leaveBalanceID;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public int getAvailableDays() {
		return availableDays;
	}

	public void setAvailableDays(int availableDays) {
		this.availableDays = availableDays;
	}

	public LeaveBalances() {
		super();
	}

	public LeaveBalances(Long leaveBalanceID, Employees employee, LeaveType leaveType, int availableDays) {
		super();
		this.leaveBalanceID = leaveBalanceID;
		this.employee = employee;
		this.leaveType = leaveType;
		this.availableDays = availableDays;
	}
    
    
    
    
}
