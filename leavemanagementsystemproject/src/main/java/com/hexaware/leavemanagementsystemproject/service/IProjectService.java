package com.hexaware.leavemanagementsystemproject.service;
import java.util.List;
import com.hexaware.leavemanagementsystemproject.dto.ProjectDTO;
import com.hexaware.leavemanagementsystemproject.entities.Project;
public interface IProjectService {
	 public Project insertProject(ProjectDTO projectID);
	  public Project updateProject(ProjectDTO projectID);
	  public ProjectDTO getByID(Long projectID);
	  public List <Project> getAll();
	  public void deleteProjectByID(Long projectID);
}
