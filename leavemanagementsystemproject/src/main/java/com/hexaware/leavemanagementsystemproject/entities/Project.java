package com.hexaware.leavemanagementsystemproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Project {
	@Id
    private Long projectID;

    private String projectName;
    private String projectDescription;
	public Project() {
		super();
	}
	public Long getProjectID() {
		return projectID;
	}
	public void setProjectID(Long projectID) {
		this.projectID = projectID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public Project(Long projectID, String projectName, String projectDescription) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
	}
    
    

}
