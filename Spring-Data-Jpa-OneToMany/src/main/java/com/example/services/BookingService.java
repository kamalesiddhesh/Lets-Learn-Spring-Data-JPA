package com.example.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entities.BookingHistory;
import com.example.entities.QRDetails;
import com.example.exceptions.ResourceNotFoundException;
import com.example.repos.BookingHistoryRepository;

import jakarta.transaction.Transactional;

@Service
public class BookingService {
	
	private final BookingHistoryRepository repo;
	public BookingService(BookingHistoryRepository repo) {
		this.repo = repo;
	}
	@Transactional
	public BookingHistory createFullBooking(BookingHistory bookingHistory) {
		System.out.println(bookingHistory);
		return repo.save(bookingHistory);
	}
	
	@Transactional
	public BookingHistory getBookingHistoryById(Long id) {
		Optional<BookingHistory> bookingHistoryOptional = repo.findById(id);
		BookingHistory bookingHistory= bookingHistoryOptional.orElseThrow(() -> new ResourceNotFoundException("Booking history not found with ID: " + id));
		
		bookingHistory.getQrDetails().forEach(qrDetail -> qrDetail.getRoutes().size());
		bookingHistory.getRoutes().size();
		return bookingHistory;
		
	}

}
