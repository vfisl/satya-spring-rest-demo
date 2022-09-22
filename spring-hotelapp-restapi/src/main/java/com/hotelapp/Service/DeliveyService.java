package com.hotelapp.Service;

import com.hotelapp.model.Delivery;
import com.hotelapp.model.Hotel;

public interface DeliveyService {

	void updateDelivery(Delivery delivery);
	void deleteDelivery(Delivery delivery);
	Delivery getDeliveryById(int hotelId);
	Delivery getDeliveryByPartner(String partnerNAme);
}
