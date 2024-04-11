package collection;

import java.util.ArrayList;
import java.util.List;

public class Bikes {

	public static void main(String[] args) {
		
		List<String> bike = new ArrayList<String>();
		
		bike.add("Kawasaki");
		bike.add("Honda CBR");
		bike.add("Suzuki");
		bike.add("Apache");
		bike.add("Pulsar");
		bike.add("Hunter 350");
		bike.add("Meteor");
		bike.add("Triumph");
		bike.add("Honda Unicorn");
		
		System.out.println(bike);
		
		searchBike(bike, "Honda");
	}
	
	//downcasting can't be done here in the formal arguments
	public static void searchBike(List bike, String search)
	{
		for (int i = 0; i < bike.size(); i++) {
			
			String op = (String) bike.get(i);
			
			if (op.contains(search)) {
				System.out.println("Bike found at position "+(i+1));
				return;
			}
		}
		
		System.out.println("Bike not found");
	}

}
