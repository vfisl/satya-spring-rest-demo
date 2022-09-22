package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.Service.DeliveyService;
import com.hotelapp.Service.HotelService;
import com.hotelapp.Service.MenuService;
import com.hotelapp.model.Address;
import com.hotelapp.model.Delivery;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}
	@Autowired
    HotelService hotelService;
	@Autowired
	DeliveyService deliveyService;
	@Autowired
	MenuService menuService;
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Address address=new Address("Btm", "Bangalore", 560076, "Karnataka");
//		Menu menu1=new Menu("paratha", 20);
//		Menu menu2 =new Menu("biriyani", 90);
//		Set<Menu>menuList=new HashSet<>(Arrays.asList(menu1,menu2));
//		Delivery delivery1=new Delivery("dunzo", 120);
//		Delivery delivery2=new Delivery("Zomato", 150);
//		//Delivery  del= deliveyService.getDeliveryByPartner("swiggy");
//		Set<Delivery>deliveryList=new HashSet<>(Arrays.asList(delivery1,delivery2));
//	     
//		Hotel hotel=new Hotel("7Brothers", address, menuList, deliveryList);
//		hotelService.addHotel(hotel);
		hotelService.getHotelsByCity("Kokrajhar").forEach(h->System.out.println(h.getHotelName()+h.getAddress().getCity()));
		hotelService.getHotelsByDelivery("dunzo").forEach(System.out::println);
		menuService.getHotelhotelName("Taj").forEach(System.out::println);
	}

}
