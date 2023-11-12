package com.hexaware.leavemanagementsystemproject.entities;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmailNotifications")
public class EmailNotifications {

    @Id
   
    private Long notificationId;

    @ManyToOne
    @JoinColumn(name = "EmployeeID")
    private Employees employee;

    @ManyToOne
    @JoinColumn(name = "ManagerApprovalID")
    private ManagerApproval managerApproval;

   
    private String notificationType;

    @Column(name = "Timestamp")
    private Date timestamp;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public ManagerApproval getManagerApproval() {
		return managerApproval;
	}

	public void setManagerApproval(ManagerApproval managerApproval) {
		this.managerApproval = managerApproval;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public EmailNotifications() {
		super();
	}

	public EmailNotifications(Long notificationId, Employees employee, ManagerApproval managerApproval,
			String notificationType, Date timestamp) {
		super();
		this.notificationId = notificationId;
		this.employee = employee;
		this.managerApproval = managerApproval;
		this.notificationType = notificationType;
		this.timestamp = timestamp;
	}

    

}

