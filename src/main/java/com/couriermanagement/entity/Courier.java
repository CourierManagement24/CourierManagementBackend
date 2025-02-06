package com.couriermanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Courier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String courierName;

	private String trackingNumber; // A unique identifier for each courier package

	private String courierDate;

	@ManyToOne
	@JoinColumn(name = "sender_id")
	private User sender; // The customer who sent the courier package

	@OneToOne
	@JoinColumn(name = "receiver_address_id")
	private Address receiverAddress; // Address of the receiver

	private String receiverName; // Name of the receiver

	private String courierType; // Type of the courier (e.g., luggage, document, gift, etc.)

	private double weight; // Weight of the courier package

	private String deliveryStatus;

	private String deliveryDate;

	private String deliveryTime; // evening, afternoon....

	private String message; // General message related to the courier, updated by Delivery Person

	@ManyToOne
	@JoinColumn(name = "delivery_person_id")
	private User deliveryPerson; // The delivery person who will deliver courier package
	
	@ManyToOne
	@JoinColumn(name = "courier_id")
	private User courier; // The courier login who has added Courier entry for customer to deliver

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getCourierDate() {
		return courierDate;
	}

	public void setCourierDate(String courierDate) {
		this.courierDate = courierDate;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Address getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(Address receiverAddress) {
		this.receiverAddress = receiverAddress;
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

	public User getDeliveryPerson() {
		return deliveryPerson;
	}

	public void setDeliveryPerson(User deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public User getCourier() {
		return courier;
	}

	public void setCourier(User courier) {
		this.courier = courier;
	}
	
	

}
