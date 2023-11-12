package com.hexaware.leavemanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.leavemanagementsystemproject.entities.Holidays;

public interface HolidaysRepository extends JpaRepository<Holidays,Long> {

}
