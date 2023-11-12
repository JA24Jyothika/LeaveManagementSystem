package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.leavemanagementsystemproject.dto.ProjectDTO;
import com.hexaware.leavemanagementsystemproject.entities.Project;
import com.hexaware.leavemanagementsystemproject.repository.ProjectRepository;
@Service
public class ProjectServiceImp implements IProjectService {
	@Autowired
    ProjectRepository projectRepo;
	@Override
	public Project insertProject(ProjectDTO projectDTO) {
		// TODO Auto-generated method stub
		Project project=new Project();
		project.setProjectID(projectDTO.getProjectID());
		project.setProjectName(projectDTO.getProjectName());
		project.setProjectDescription(projectDTO.getProjectDescription());
		return projectRepo.save(project);
	}

	@Override
	public Project updateProject(ProjectDTO projectDTO) {
		// TODO Auto-generated method stub
		Project project=new Project();
		project.setProjectID(projectDTO.getProjectID());
		project.setProjectName(projectDTO.getProjectName());
		project.setProjectDescription(projectDTO.getProjectDescription());
		return projectRepo.save(project);
	}

	@Override
	public ProjectDTO getByID(Long projectID) {
		// TODO Auto-generated method stub
		ProjectDTO projectDTO=new ProjectDTO();
		Project project=projectRepo.findById(projectID).orElse(null);
		projectDTO.setProjectID(project.getProjectID());
		projectDTO.setProjectName(project.getProjectName());
		projectDTO.setProjectDescription(project.getProjectDescription());
		return projectDTO;
	}

	@Override
	public List<Project> getAll() {
		// TODO Auto-generated method stub
		return projectRepo.findAll();
	}

	@Override
	public void deleteProjectByID(Long projectID) {
		projectRepo.deleteById(projectID);

	}

}
