package com.hexaware.leavemanagementsystemproject.dto;

import jakarta.persistence.Id;

public class ProjectDTO {
	
	 private Long projectID;
     private String projectName;
	 private String projectDescription;
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
	public ProjectDTO(Long projectID, String projectName, String projectDescription) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
	}
	public ProjectDTO() {
		super();
	}
	 
}
