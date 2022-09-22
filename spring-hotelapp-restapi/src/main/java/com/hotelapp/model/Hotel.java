package com.hotelapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Hotel {
 @Id
 @GeneratedValue(generator = "hotel_id",strategy = GenerationType.AUTO)
 @SequenceGenerator(name = "hotel_id",sequenceName = "hotel_id")
   private Integer hotelId;
   private String hotelName;
   @OneToOne(cascade=javax.persistence.CascadeType.ALL)
   @JoinColumn(name="address_id")
   private Address address;
   @OneToMany(cascade = javax.persistence.CascadeType.ALL,fetch = FetchType.EAGER)
   @JoinColumn(name="hotel_id")
   private Set<Menu> menuList;
   @ManyToMany(cascade = javax.persistence.CascadeType.PERSIST,fetch = FetchType.EAGER)
   @JoinTable(name="hotel_delivery", joinColumns = @JoinColumn(name="hotel_id"),inverseJoinColumns = @JoinColumn(name="delivery_id"))
   private Set<Delivery> delivery;
   
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public Hotel(String hotename, Address address, Set<Menu> menuList, Set<Delivery> delivery) {
	super();
	this.hotelName = hotename;
	this.address = address;
	this.menuList = menuList;
	this.delivery = delivery;
}

public Integer getHotelId() {
	return hotelId;
}
public void setHotelId(Integer hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Set<Menu> getMenuList() {
	return menuList;
}
public void setMenuList(Set<Menu> menuList) {
	this.menuList = menuList;
}
public Set<Delivery> getDelivery() {
	return delivery;
}
public void setDelivery(Set<Delivery> delivery) {
	this.delivery = delivery;
}
@Override
public String toString() {
	return "Hotel [hotename=" + hotelName + ", address=" + address + ", menuList=" + menuList + ", delivery=" + delivery
			+ "]";
}
   
   
}
