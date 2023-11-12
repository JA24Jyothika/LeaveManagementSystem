package com.hexaware.leavemanagementsystemproject.dto;

import java.util.Date;

public class HolidaysDTO {
	private Long holidayID;
    private Date holidayDate;
    private String holidayDescription;
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
	public HolidaysDTO() {
		super();
	}
	public HolidaysDTO(Long holidayID, Date holidayDate, String holidayDescription) {
		super();
		this.holidayID = holidayID;
		this.holidayDate = holidayDate;
		this.holidayDescription = holidayDescription;
	}
    
}
