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
import com.hexaware.leavemanagementsystemproject.entities.Admin;
import com.hexaware.leavemanagementsystemproject.service.AdminServiceImp;
@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
    @Autowired
	AdminServiceImp service;
    @PostMapping(value="/add")
    public Admin insertAdmin(@RequestBody AdminDTO adminDTO) {
    	return service.insertAdmin(adminDTO);
    }
    @PutMapping(value="update")
    public Admin updateAdmin(@RequestBody AdminDTO adminDTO)
    {
    	return service.updateAdmin(adminDTO);
    }
    @GetMapping(value="/get/{adminID}")
    public AdminDTO getByID(@PathVariable Long adminID)
    {
    	return service.getByID(adminID);
    }
    @GetMapping(value="/getall")
	   public List<Admin> getAllCustomer()
	   {
		   return service.getAll();
	   }
    @DeleteMapping("/delete/{adminId}")
    public void deleteAdminByID(@PathVariable Long adminID)
    {
    	 service.deleteAdminByID(adminID);
    }
}
