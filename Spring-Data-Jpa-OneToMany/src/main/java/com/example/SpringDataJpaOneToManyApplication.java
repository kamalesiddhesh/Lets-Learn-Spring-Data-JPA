package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.BookingHistory;
import com.example.entities.QRDetails;
import com.example.entities.Route;
import com.example.services.BookingService;

import lombok.experimental.var;

@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
		var service = context.getBean(BookingService.class);
		
		BookingHistory b1 = new BookingHistory();
		b1.setName("Siddhesh");
		
		QRDetails qr1 = new QRDetails();
		qr1.setQrPayload("1234");
		
		QRDetails qr2 = new QRDetails();
		qr2.setQrPayload("0987");
		
		Route r1 = new Route();
		r1.setSource("Ghansoli");
		r1.setDestination("Vashi");	
		r1.setQrDetails(qr1);
		r1.setBookingHistory(b1);
		
		Route r2 = new Route();
		r2.setSource("Vashi");
		r2.setDestination("Panvel");
		r2.setQrDetails(qr1);
		r2.setBookingHistory(b1);
		
		Route r3 = new Route();
		r3.setSource("Vashi");
		r3.setDestination("Kurla");
		r3.setQrDetails(qr2);
		r3.setBookingHistory(b1);
		
		Route r4 = new Route();
		r4.setSource("Kurla");
		r4.setDestination("Matunga");	
		r4.setQrDetails(qr2);
		r4.setBookingHistory(b1);
		
		qr1.setRoutes(List.of(r1,r2));
		qr2.setRoutes(List.of(r3,r4));
		
		qr1.setBookingHistory(b1);
		qr2.setBookingHistory(b1);
		
		b1.setQrDetails(List.of(qr1,qr2));
		b1.setRoutes(List.of(r1,r2,r3,r4));
		
		service.createFullBooking(b1);
	}

}
