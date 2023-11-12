package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.leavemanagementsystemproject.dto.AdminDTO;
import com.hexaware.leavemanagementsystemproject.entities.Admin;
import com.hexaware.leavemanagementsystemproject.repository.AdminRepository;

@Service
public class AdminServiceImp implements IAdminService {
	@Autowired
    AdminRepository adminRepo;
	@Override
	public Admin insertAdmin(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAdminId(adminDTO.getAdminId());
		admin.setAdminUsername(adminDTO.getAdminUsername());
		admin.setAdminPassword(adminDTO.getAdminPassword());
		admin.setAdminEmail(adminDTO.getAdminEmail());
		return adminRepo.save(admin);
		
	}
	@Override
	public Admin updateAdmin(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAdminId(adminDTO.getAdminId());
		admin.setAdminUsername(adminDTO.getAdminUsername());
		admin.setAdminPassword(adminDTO.getAdminPassword());
		admin.setAdminEmail(adminDTO.getAdminEmail());
		return adminRepo.save(admin);
	}
	@Override
	public AdminDTO getByID(Long adminID) {
		Admin admin=adminRepo.findById(adminID).orElse(null);
		AdminDTO adminDTO=new AdminDTO();
		adminDTO.setAdminId(admin.getAdminId());
		adminDTO.setAdminPassword(admin.getAdminPassword());
		adminDTO.setAdminEmail(admin.getAdminEmail());
		return adminDTO;
	}
	@Override
	public List <Admin> getAll() {
		
	  return adminRepo.findAll();
	}
	@Override
	public void deleteAdminByID(Long adminID) {
		adminRepo.deleteById(adminID);
	}

}
