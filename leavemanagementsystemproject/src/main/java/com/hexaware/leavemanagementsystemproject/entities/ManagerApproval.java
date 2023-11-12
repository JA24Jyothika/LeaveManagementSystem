package com.hexaware.leavemanagementsystemproject.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class ManagerApproval {
	@Id
    
    private Long managerApprovalID;

    @ManyToOne
    @JoinColumn(name = "leaveRequestID")
    private LeaveRequest leaveRequest;

    @ManyToOne
    @JoinColumn(name = "managerID")
    private Employees manager;

    @Enumerated(EnumType.STRING)
    private ApprovalStatus approvalStatus;

    private Date approvalDate;

	public Long getManagerApprovalID() {
		return managerApprovalID;
	}

	public void setManagerApprovalID(Long managerApprovalID) {
		this.managerApprovalID = managerApprovalID;
	}

	public LeaveRequest getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequest leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public Employees getManager() {
		return manager;
	}

	public void setManager(Employees manager) {
		this.manager = manager;
	}

	public ApprovalStatus getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(ApprovalStatus approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public ManagerApproval(Long managerApprovalID, LeaveRequest leaveRequest, Employees manager,
			ApprovalStatus approvalStatus, Date approvalDate) {
		super();
		this.managerApprovalID = managerApprovalID;
		this.leaveRequest = leaveRequest;
		this.manager = manager;
		this.approvalStatus = approvalStatus;
		this.approvalDate = approvalDate;
	}

	public ManagerApproval() {
		super();
	}
    
    

}
