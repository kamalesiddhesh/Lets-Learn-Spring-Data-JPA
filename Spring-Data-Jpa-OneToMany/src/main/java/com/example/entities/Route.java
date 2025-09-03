package com.example.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "route")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "SOURCE")
	private String source;
	
	@Column(name = "DESTINATION")
	private String destination;
	
	@ManyToOne
	@JoinColumn(name = "ID_QR_DETAILS",nullable = false,referencedColumnName = "ID")
	@JsonBackReference
	private QRDetails qrDetails;
	
	@ManyToOne
	@JoinColumn(name = "ID_BOOKING_HISTORY",nullable = false,referencedColumnName = "ID")
	@JsonBackReference
	private BookingHistory bookingHistory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public QRDetails getQrDetails() {
		return qrDetails;
	}

	public void setQrDetails(QRDetails qrDetails) {
		this.qrDetails = qrDetails;
	}

	public BookingHistory getBookingHistory() {
		return bookingHistory;
	}

	public void setBookingHistory(BookingHistory bookingHistory) {
		this.bookingHistory = bookingHistory;
	}

	@Override
	public String toString() {
	    // Exclude the 'qrDetails' field to prevent recursion
	    return "Route [id=" + id + ", source=" + source + ", destination=" + destination + "]";
	}
}
