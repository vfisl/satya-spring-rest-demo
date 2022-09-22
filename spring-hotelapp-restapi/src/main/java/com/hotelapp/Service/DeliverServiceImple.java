package com.hotelapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelapp.model.Delivery;
import com.hotelapp.repository.DeliveryRepository;
@Service
@Transactional
public class DeliverServiceImple implements DeliveyService {
	@Autowired
	DeliveryRepository deliveryRepository;

	@Override
	public void updateDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);
		
	}

	@Override
	public void deleteDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		deliveryRepository.save(delivery);
	}

	@Override
	public Delivery getDeliveryById(int hotelId) {
		return deliveryRepository.findById(hotelId).get();
	}

	@Override
	public Delivery getDeliveryByPartner(String partnerNAme) {
		 return deliveryRepository.findByPartnerName(partnerNAme);
	}

}
