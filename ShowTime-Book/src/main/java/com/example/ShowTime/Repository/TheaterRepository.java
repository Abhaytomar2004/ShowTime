package com.example.ShowTime.Repository;


import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShowTime.Models.Theater;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
    Theater findByLocation(String location);
}
