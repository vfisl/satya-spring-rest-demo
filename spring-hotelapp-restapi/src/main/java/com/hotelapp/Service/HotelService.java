package com.hotelapp.Service;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelService {
	Hotel addHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	Hotel getHoteById(int hotelId);
	void deleteHotel(int hotelId);
	
	List<Hotel> getHotelsByCity(String city);
	List<Hotel> getHotelsByMenu(String menuName);
	List<Hotel> getHotelsByDelivery(String paertnerName);
	List<Hotel> getHotelsByLocation(String location);
	List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
	

}
