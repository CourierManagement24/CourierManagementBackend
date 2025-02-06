package com.couriermanagement.service;

import java.util.List;

import com.couriermanagement.entity.Courier;
import com.couriermanagement.entity.User;

public interface CourierService {
	
	Courier addCourier(Courier courier);
	
	Courier updateCourier(Courier courier);
	
	Courier getCourierById(int courierId);
	
	List<Courier> getAllCourier();
	
	Courier getCourierByTrackingNumber(String trackingNumber);
	
	List<Courier> getCourierBySender(User sender);    //A user might send multiple couriers
	
	List<Courier> getCourierByCourier(User courier);   //If courier refers to a delivery company, there could be many couriers from that company.
	
	List<Courier> getCourierByDeliveryPerson(User deliveryPerson);  //A delivery person might have multiple deliveries.
	
}
