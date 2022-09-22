package com.hotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Menu {
	
	@Id
	 @GeneratedValue(generator = "menu_id",strategy = GenerationType.AUTO)
	 @SequenceGenerator(name = "menu_id",sequenceName = "menu_id")
	private Integer menuId;
	private String menuName;
	private double price;
	@ManyToOne
	private Hotel hotel;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String menuName, double price) {
		super();
		this.menuName = menuName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", hotel=" + hotel + "]";
	}
	
	
}
