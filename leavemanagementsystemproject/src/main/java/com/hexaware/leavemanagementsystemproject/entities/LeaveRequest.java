package com.hexaware.leavemanagementsystemproject.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class LeaveRequest {
	@Id
    
    private Long leaveRequestID;

    @ManyToOne
    @JoinColumn(name = "employeeID")
    private Employees employee;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "leaveTypeID")
    private LeaveType leaveType;

    @Enumerated(EnumType.STRING)
    private LeaveStatus leaveStatus;

    private Date appliedDate;

    @OneToMany(mappedBy = "leaveRequest")
    private List<ManagerApproval> managerApprovals;

	public Long getLeaveRequestID() {
		return leaveRequestID;
	}

	public void setLeaveRequestID(Long leaveRequestID) {
		this.leaveRequestID = leaveRequestID;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public List<ManagerApproval> getManagerApprovals() {
		return managerApprovals;
	}

	public void setManagerApprovals(List<ManagerApproval> managerApprovals) {
		this.managerApprovals = managerApprovals;
	}

	public LeaveRequest() {
		super();
	}

	public LeaveRequest(Long leaveRequestID, Employees employee, Date startDate, Date endDate, LeaveType leaveType,
			LeaveStatus leaveStatus, Date appliedDate, List<ManagerApproval> managerApprovals) {
		super();
		this.leaveRequestID = leaveRequestID;
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
		this.appliedDate = appliedDate;
		this.managerApprovals = managerApprovals;
	}
    
    

	
    
    

    

}
