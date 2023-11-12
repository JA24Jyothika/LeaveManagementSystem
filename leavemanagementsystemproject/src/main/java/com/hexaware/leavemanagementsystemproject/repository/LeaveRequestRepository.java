package com.hexaware.leavemanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.leavemanagementsystemproject.entities.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest,Long> {

}
