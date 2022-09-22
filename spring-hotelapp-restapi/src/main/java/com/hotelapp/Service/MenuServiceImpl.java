package com.hotelapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Menu;
import com.hotelapp.repository.MenuRepository;
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menuRepository;
	@Override
	public List<Menu> getHotelhotelName(String hotelname) {
		// TODO Auto-generated method stub
		return menuRepository.getByHotelHotelName(hotelname);
	}

}
