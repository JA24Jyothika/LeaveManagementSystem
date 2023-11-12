package com.hexaware.leavemanagementsystemproject.entities;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Employees {
    @Id
    private Long employeeID;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String role;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    private List<LeaveRequest> leaveRequests;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    private List<LeaveBalances> leaveBalances;

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employees(Long employeeID, String email, String firstName, String lastName, String password, String role) {
		super();
		this.employeeID = employeeID;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
	}

	public Employees() {
		super();
	}
    
    

	

    
	
    
}
