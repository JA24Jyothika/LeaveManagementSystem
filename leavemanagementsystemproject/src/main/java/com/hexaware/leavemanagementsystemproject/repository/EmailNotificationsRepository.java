package com.hexaware.leavemanagementsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.leavemanagementsystemproject.entities.EmailNotifications;

public interface EmailNotificationsRepository extends JpaRepository<EmailNotifications,Long> {

}
