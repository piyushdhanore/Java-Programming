package collection;

public class Student {

	String name;
	int age;
	int std;
	String school = "st. Xavier school";
	String blood;
	String address;
	double fees;
	
	public Student() {
		
	}

	public Student(String name, int age, int std, String blood, String address, double fees) {
		super();
		this.name = name;
		this.age = age;
		this.std = std;
		this.blood = blood;
		this.address = address;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", std=" + std + ", school=" + school + ", blood=" + blood
				+ ", address=" + address + ", fees=" + fees + "]";
	}
	
	
	
	
}
