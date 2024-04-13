package collection;

import java.util.ArrayList;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		
		List<Student> db = new ArrayList<Student>();
		
		db.add(new Student ("Mathew", 12,7, "O+","Decaan", 200000.00));
		db.add(new Student ("Jordon", 16,12, "A+","Hadapsar", 700000.00));
		db.add(new Student ("Jesus", 0,10, "O+","Mecca", 0.00));
		db.add(new Student ("Methuselah", 8,3, "O-","Syria", 900000.00));
		db.add(new Student ("Kevin", 18,12, "B+","London", 1100000.00));
		db.add(new Student ("Christian", 6,1, "AB-","Aisle", 500000.00));
		db.add(new Student ("Paul", 15,8, "B-","Baltimore", 400000.00));
		db.add(new Student ("Linda", 11,6, "B+","Mexico", 800000.00));
		db.add(new Student ("Kalidas", 18, 12, "O+","Chimur", 900000.00));
		
		System.out.println(db);
		
		searchStudent(db, "Jesus");
		
		checkFees(db, 400000);
		
		sort(db);
		
		System.out.println(db);
	}
	
	public static void searchStudent(List<Student> db, String name) {
		
		boolean flag = false;
		
		for (Student object : db) {
			
			if (object.name.equalsIgnoreCase(name)) {
				
				flag = true;
				System.out.println("Found at "+(db.indexOf(object)+1)+" position");
				break;
			}
		}
		
		if (!flag) {
			System.out.println("Student not found");
		}
	}
	
	public static void checkFees(List<Student> db, int fees) {
		
		for (Student object : db) {
			
			if (object.fees<fees) {
				
				System.out.println(object);
			}
		}
	}
	
	public static void sort(List<Student> l1) {
		
		for (int i = 0; i < l1.size()-1; i++) {
			
			for (int j = 0; j < l1.size()-i-1; j++) {
				
				if (l1.get(j).age>l1.get(j+1).age) {
					
					Student temp = l1.get(j);
					l1.set(j, l1.get(j+1));
					l1.set(j+1, temp);
				}
			}
		}
	}
}
