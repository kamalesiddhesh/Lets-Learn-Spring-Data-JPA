package com.example.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import com.example.entities.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "qr_details")
public class QRDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "QRPAYLOAD")
	private String qrPayload;
	
	@ManyToOne
	@JoinColumn(name ="ID_BOOKING_HISTORY", nullable = false,referencedColumnName = "ID")
	@JsonBackReference
	private BookingHistory bookingHistory;
	
	@OneToMany(mappedBy = "qrDetails", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Route> routes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQrPayload() {
		return qrPayload;
	}

	public void setQrPayload(String qrPayload) {
		this.qrPayload = qrPayload;
	}

	public BookingHistory getBookingHistory() {
		return bookingHistory;
	}

	public void setBookingHistory(BookingHistory bookingHistory) {
		this.bookingHistory = bookingHistory;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
	    // Exclude the 'bookingHistory' field to prevent recursion
	    return "QRDetails [id=" + id + ", qrPayload=" + qrPayload + ", routes=" + routes + "]";
	}
}
