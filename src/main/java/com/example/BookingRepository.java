package com.example;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

	Collection<Booking> findByBookingName(String bookingName);

}
