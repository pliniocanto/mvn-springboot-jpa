package com.example;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookingController {

	@Autowired
	BookingRepository bookingRepository;

	@RequestMapping("/bookings")
	@ResponseBody
	Collection<Booking> bookings() {

		return bookingRepository.findAll();

	}

}
