package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	List<Hotel>findByAddressCity(String city);
	@Query("from Hotel h inner join h.menuList ml where ml.menuName=?1")
	List<Hotel>findHotelsByMenu(String menuName);
	@Query("from Hotel h inner join h.delivery dl where dl.partnerName=?1")
	List<Hotel> getHotelsByDelivery(String paertnerName);

}
