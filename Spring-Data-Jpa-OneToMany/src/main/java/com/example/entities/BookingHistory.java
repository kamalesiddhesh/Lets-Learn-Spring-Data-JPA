package com.example.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "booking_history")
public class BookingHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name="NAME",nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "bookingHistory", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<QRDetails> qrDetails;
	
	@OneToMany(mappedBy = "bookingHistory",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonManagedReference
	private List<Route> routes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<QRDetails> getQrDetails() {
		return qrDetails;
	}

	public void setQrDetails(List<QRDetails> qrDetails) {
		this.qrDetails = qrDetails;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
	    return "BookingHistory [id=" + id + ", name=" + name + ", qrDetails=" + qrDetails + "]";
	}
	
	
	
}
