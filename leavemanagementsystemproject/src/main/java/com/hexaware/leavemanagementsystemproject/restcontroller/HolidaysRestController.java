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

import com.hexaware.leavemanagementsystemproject.dto.HolidaysDTO;
import com.hexaware.leavemanagementsystemproject.entities.Holidays;
import com.hexaware.leavemanagementsystemproject.service.HolidaysServiceImp;
@RestController
@RequestMapping("/api/holidays")

public class HolidaysRestController {
   @Autowired
	HolidaysServiceImp holidaysService;
   @PostMapping(value="/addholidays")
   public Holidays insertHolidays(@RequestBody HolidaysDTO holidayDTO)
   {
	   return holidaysService.insertHolidays(holidayDTO);
   }
   @PutMapping(value="/updateholidays")
   public Holidays updateHolidays(@RequestBody HolidaysDTO holidayDTO)
   {
	   return holidaysService.updateHolidays( holidayDTO);
   }
   @GetMapping(value="/get/{holidayID}")
   public HolidaysDTO getByID(@PathVariable Long holidayID)
   {
	   return holidaysService.getByID(holidayID);
   }
   @GetMapping(value="/getholidays")
   public List<Holidays> getAll()
   {
	   return holidaysService.getAll();
   }
   @DeleteMapping(value="/deleteholiday/{holidayID}")
   public void deleteHolidayByID(@PathVariable Long holidayID)
   {
	   holidaysService.deleteHolidayByID(holidayID);
   }
}
