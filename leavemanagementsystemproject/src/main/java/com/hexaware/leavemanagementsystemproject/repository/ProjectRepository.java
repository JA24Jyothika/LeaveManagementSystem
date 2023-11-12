package com.hexaware.leavemanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.leavemanagementsystemproject.entities.Project;

public interface ProjectRepository  extends JpaRepository<Project,Long>{

}
