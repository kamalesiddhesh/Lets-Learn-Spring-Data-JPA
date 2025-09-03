package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.BookingHistory;
import com.example.services.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	
	private final BookingService bookingService;
	
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	/**
	 * REST endpoint to retrieve a full booking history, including all
	 * associated QRDetails and Routes, by its ID.
	 *
	 * @param id The ID of the booking history to fetch.
	 * @return A ResponseEntity containing the BookingHistory object as JSON.
	 */
	@GetMapping("/{id}")
	public ResponseEntity<BookingHistory> getFullBooking(@PathVariable Long id) {
		// Call the service method to fetch the complete entity graph
		BookingHistory bookingHistory = bookingService.getBookingHistoryById(id);
		return ResponseEntity.ok(bookingHistory);
	}

}
