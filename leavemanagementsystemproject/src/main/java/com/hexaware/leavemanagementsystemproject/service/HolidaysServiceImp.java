package com.hexaware.leavemanagementsystemproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.leavemanagementsystemproject.dto.HolidaysDTO;
import com.hexaware.leavemanagementsystemproject.entities.Holidays;
import com.hexaware.leavemanagementsystemproject.repository.HolidaysRepository;

@Service
public class HolidaysServiceImp implements IHolidaysService {
    
	@Autowired
	HolidaysRepository holidaysRepo;
	@Override
	public Holidays insertHolidays(HolidaysDTO holidayDTO) {
		// TODO Auto-generated method stub
		Holidays holidays=new Holidays();
		holidays.setHolidayID(holidayDTO.getHolidayID());
		holidays.setHolidayDate(holidayDTO.getHolidayDate());
		holidays.setHolidayDescription(holidayDTO.getHolidayDescription());
		return holidaysRepo.save(holidays);
	}

	@Override
	public Holidays updateHolidays(HolidaysDTO holidayDTO) {
		// TODO Auto-generated method stub
		Holidays holidays=new Holidays();
		holidays.setHolidayID(holidayDTO.getHolidayID());
		holidays.setHolidayDate(holidayDTO.getHolidayDate());
		holidays.setHolidayDescription(holidayDTO.getHolidayDescription());
		return holidaysRepo.save(holidays);
	}

	@Override
	public HolidaysDTO getByID(Long holidayID) {
		// TODO Auto-generated method stub
		HolidaysDTO holidaysDTO=new HolidaysDTO();
		Holidays holidays=holidaysRepo.findById(holidayID).orElse(null);;
		holidaysDTO.setHolidayID(holidays.getHolidayID());
		holidaysDTO.setHolidayDate(holidays.getHolidayDate());
		holidaysDTO.setHolidayDescription(holidays.getHolidayDescription());
		return holidaysDTO;
	}

	@Override
	public List<Holidays> getAll() {
		// TODO Auto-generated method stub
		return holidaysRepo.findAll();
	}

	@Override
	public void deleteHolidayByID(Long holidayID) {
		// TODO Auto-generated method stub
       holidaysRepo.deleteById(holidayID);
	}

}
