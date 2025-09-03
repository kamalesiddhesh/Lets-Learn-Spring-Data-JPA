package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.BookingHistory;

@Repository
public interface BookingHistoryRepository extends JpaRepository<BookingHistory, Long>{

}
