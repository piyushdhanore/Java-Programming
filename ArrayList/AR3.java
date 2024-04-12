package collection;

import java.util.ArrayList;
import java.util.List;

public class AR3 {

	public static void main(String[] args) {
		
		List<String> shop = new ArrayList<String>();
		
		shop.add("Kurkure");
		shop.add("Lays");
		shop.add("Butter");
		shop.add("Munch");
		shop.add("chocobar");
		shop.add("Balaji");
		shop.add("Maggie");
		shop.add("Oreo");
		shop.add("Pasta");
		shop.add("Cocoa-Cola");
		shop.add("Milk");
		shop.add("soap");
		
		List<String> ban = new ArrayList<String>();
		
		ban.add("Oreo");
		ban.add("Maggie");
		ban.add("Pasta");
		ban.add("Sting");
		ban.add("Ice Cream");

		shop.removeAll(ban);
		System.out.println(shop);
		
		shop.retainAll(ban);
		System.out.println(shop);
	}

}
