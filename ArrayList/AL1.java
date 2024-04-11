package collection;

import java.util.ArrayList;
import java.util.List;

public class AL1 {

	public static void main(String[] args) {
		
		List al1 = new ArrayList();
		
		al1.add(true);
		al1.add(10);
		al1.add(234.45);
		al1.add(null);
		al1.add(true);
		al1.add("Lord of the rings");
		al1.add('g');
		al1.add(35l);
		al1.add(56.45f);
		
		System.out.println(al1);

	}

}
