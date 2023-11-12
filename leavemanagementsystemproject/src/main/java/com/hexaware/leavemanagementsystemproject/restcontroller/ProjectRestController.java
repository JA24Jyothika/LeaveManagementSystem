package com.hexaware.leavemanagementsystemproject.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.leavemanagementsystemproject.dto.AdminDTO;
import com.hexaware.leavemanagementsystemproject.dto.ProjectDTO;
import com.hexaware.leavemanagementsystemproject.entities.Admin;
import com.hexaware.leavemanagementsystemproject.entities.Project;
import com.hexaware.leavemanagementsystemproject.service.ProjectServiceImp;

@RestController
@RequestMapping("/api/projects")
public class ProjectRestController {
	@Autowired
ProjectServiceImp projectService;
@PostMapping(value="/addProject")
public Project insertProject(@RequestBody ProjectDTO projectDTO)
{
	return projectService.insertProject(projectDTO);
}
@PutMapping(value="/updateProject")
public Project updateProject(@RequestBody ProjectDTO projectDTO) 
{
	return projectService.updateProject(projectDTO);
}
@GetMapping(value="/get/{projectID}")
public ProjectDTO getByID(@PathVariable Long projectID)
{
	return projectService.getByID(projectID);
}
@GetMapping(value="/getAllProjects")
   public List<Project> getAll()
   {
	   return projectService.getAll();
   }
@DeleteMapping("/delete/{projectId}")
public void deleteAdminByID(@PathVariable Long projectID)
{
	 projectService.deleteProjectByID(projectID);
}
}
