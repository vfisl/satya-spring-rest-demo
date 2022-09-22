package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;
@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
	
     List<Menu> getByHotelHotelName(String hotelname);
}
