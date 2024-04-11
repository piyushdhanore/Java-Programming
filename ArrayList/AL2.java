package collection;

import java.util.ArrayList;
import java.util.List;

public class AL2 {

	public static void main(String[] args) {
		
		List<String> dogs = new ArrayList<String>();
		
		dogs.add("PitBull");
		dogs.add("German Shephard");
		dogs.add("Poodle");
		dogs.add("Rottweiler");
		dogs.add("Beagle");
		dogs.add("Dachshund");
		dogs.add("Shih Tzu");
		
		//all these inputs are stored in Object class i.e., in the for of objects
		
		System.out.println(dogs);
		
		List<String> snakes = new ArrayList<String>();
		
		snakes.add("Green Anaconda");
		snakes.add("Python");
		snakes.add("Threadsnake");
		snakes.add("Taipan");
		snakes.add("cobra");
		snakes.add("scarlet snake");
		snakes.add("Black Mamba");
		
		System.out.println(snakes);
		
		List<String> shop = new ArrayList<String>();
		
		shop.addAll(dogs);
		shop.addAll(snakes);
		
		System.out.println(checkBreed(shop,"beagle"));
	}
	
	public static boolean checkBreed(List breeds, String search)
	{
		for (int i = 0; i < breeds.size(); i++) {
			
			String op = (String)breeds.get(i);	//downcasting
			
			if (op.equalsIgnoreCase(search)) {
				return true;
			}
		}
		
		return false;
	}

}
