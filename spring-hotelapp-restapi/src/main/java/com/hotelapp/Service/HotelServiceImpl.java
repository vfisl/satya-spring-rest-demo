package com.hotelapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
import com.hotelapp.repository.HotelRepository;
@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
		
	}

	@Override
	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelRepository.save(hotel);
		
	}

	@Override
	public Hotel getHoteById(int hotelId) {
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
		
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		return hotelRepository.findByAddressCity(city);
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String paertnerName) {
		return hotelRepository.getHotelsByDelivery(paertnerName);
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

}
