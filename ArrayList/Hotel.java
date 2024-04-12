package collection;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	public static void main(String[] args) {
		
		List<String> hotel = new ArrayList<String>();
		
		hotel.add("Chicken Kebab");
		hotel.add("Chicken Biryani");
		hotel.add("Chicken Kheema");
		hotel.add("Mutton Biryani");
		hotel.add("Chicken Mhuglai");
		hotel.add("Veg Biryani");
		hotel.add("Panner Butter Masala");
		hotel.add("Mix Veg");
		hotel.add("Palaak Panner");
		hotel.add("Aloo Paratha");
		hotel.add("Mix Veg Paratha");
		hotel.add("Paneer Bhurji");
		hotel.add("Chicken 65");
		hotel.add("Tava Pualo");
		
		searchDish(hotel,"bir");
	}
	
	public static void searchDish(List<String> hotel, String search) {
		
		for (Object o : hotel) {
			
			String dish = (String) o;
			if (dish.toLowerCase().contains(search.toLowerCase())) {
				System.out.println(dish);
			}
		}
		
	}

}
