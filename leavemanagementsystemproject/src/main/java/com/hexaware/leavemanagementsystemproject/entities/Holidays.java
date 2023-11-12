package com.hexaware.leavemanagementsystemproject.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Holidays")

public class Holidays {
 
	@Id
    private Long holidayID;
    private Date holidayDate;
    private String holidayDescription;
	public Holidays() {
		super();
	}
	public Holidays(Long holidayID, Date holidayDate, String holidayDescription) {
		super();
		this.holidayID = holidayID;
		this.holidayDate = holidayDate;
		this.holidayDescription = holidayDescription;
	}
	public Long getHolidayID() {
		return holidayID;
	}
	public void setHolidayID(Long holidayID) {
		this.holidayID = holidayID;
	}
	public Date getHolidayDate() {
		return holidayDate;
	}
	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}
	public String getHolidayDescription() {
		return holidayDescription;
	}
	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}
    


}
