package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import com.hexaware.leavemanagementsystemproject.dto.HolidaysDTO;
import com.hexaware.leavemanagementsystemproject.entities.Holidays;


public interface IHolidaysService {
	  public Holidays insertHolidays(HolidaysDTO holidayDTO);
	  public Holidays updateHolidays(HolidaysDTO holidayDTO);
	  public HolidaysDTO getByID(Long holidayID);
	  public List <Holidays> getAll();
	  public void deleteHolidayByID(Long holidayID);
}
