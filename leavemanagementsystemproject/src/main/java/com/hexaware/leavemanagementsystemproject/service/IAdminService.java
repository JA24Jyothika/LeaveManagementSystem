package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import com.hexaware.leavemanagementsystemproject.dto.AdminDTO;
import com.hexaware.leavemanagementsystemproject.entities.Admin;

public interface IAdminService {
  public Admin insertAdmin(AdminDTO adminDTO);
  public Admin updateAdmin(AdminDTO adminDTO);
  public AdminDTO getByID(Long adminID);
  public List <Admin> getAll();
  public void deleteAdminByID(Long adminID);
  
}
