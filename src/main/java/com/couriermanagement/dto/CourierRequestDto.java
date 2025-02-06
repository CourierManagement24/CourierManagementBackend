package com.couriermanagement.dto;

import org.springframework.beans.BeanUtils;

import com.couriermanagement.entity.Address;

import lombok.Data;

@Data
public class CourierRequestDto {
	
	// for assigning delivery person for Courier Package
	private int id;  // for assigning delivery person
	
	private int deliveryPersonId;  // for assigning delivery person
	
	// for updating the Courier Status by Delivery Person
	private String deliveryStatus;

	private String deliveryDate;

	private String deliveryTime; // evening, afternoon....

	private String message; // General message related to the courier, updated by Delivery Person

	// for adding courier
	private String courierName;

	private String customerRefId;
	
	private int courierUserId;  // User primary key
	
    private String street;
	
	private String landmark;

	private String city;

	private String pincode;
	
	private String state;
	
	private String country;

	private String receiverName; // Name of the receiver

	private String courierType; // Type of the courier (e.g., luggage, document, gift, etc.)

	private double weight; // Weight of the courier package	
	
	public static Address toAddressEntity(CourierRequestDto courierRequestDto) {     //CourierRequestDto courierRequestDto → The DTO input parameter that contains address-related data
		Address address = new Address();
		BeanUtils.copyProperties(courierRequestDto, address);
		return address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeliveryPersonId() {
		return deliveryPersonId;
	}

	public void setDeliveryPersonId(int deliveryPersonId) {
		this.deliveryPersonId = deliveryPersonId;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCustomerRefId() {
		return customerRefId;
	}

	public void setCustomerRefId(String customerRefId) {
		this.customerRefId = customerRefId;
	}

	public int getCourierUserId() {
		return courierUserId;
	}

	public void setCourierUserId(int courierUserId) {
		this.courierUserId = courierUserId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getCourierType() {
		return courierType;
	}

	public void setCourierType(String courierType) {
		this.courierType = courierType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
