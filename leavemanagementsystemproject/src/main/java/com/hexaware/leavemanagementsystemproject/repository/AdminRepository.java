package com.hexaware.leavemanagementsystemproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hexaware.leavemanagementsystemproject.entities.Admin;
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
