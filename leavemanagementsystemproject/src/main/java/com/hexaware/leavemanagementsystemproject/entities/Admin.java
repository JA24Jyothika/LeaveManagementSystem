package com.hexaware.leavemanagementsystemproject.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
@Entity
@Table(name = "Admin")
public class Admin {
	    @Id
	  
	    private Long adminId;
        private String adminUsername;
        private String adminPassword;
	    @Email(message="Email cannot be Empty")
	    private String adminEmail;
		public Admin() {
			super();
		}
		public Admin(Long adminId, String adminUsername, String adminPassword, @Email String adminEmail) {
			super();
			this.adminId = adminId;
			this.adminUsername = adminUsername;
			this.adminPassword = adminPassword;
			this.adminEmail = adminEmail;
		}
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
        
	    
	    
	    

	   
	}


