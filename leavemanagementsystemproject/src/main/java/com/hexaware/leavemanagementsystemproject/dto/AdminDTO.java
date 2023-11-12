package com.hexaware.leavemanagementsystemproject.dto;

import jakarta.validation.constraints.Email;

public class AdminDTO {
	 private Long adminId;
     private String adminUsername;
     private String adminPassword;
	 private String adminEmail;
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public AdminDTO(Long adminId, String adminUsername, String adminPassword, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
	}
	public AdminDTO() {
		super();
	}
	 
}
