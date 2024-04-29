package Super;

public class AccessPrivateVariableUsingSuperKeyword {
	public static void main(String[]  args) {
		Student me = new Student("Saidul", 5, 25, "BU");
		System.out.println(me.getName());
	}
}

class Human {
	private String name;
	private int age;
	public Human() { // it has to be created for extending it from Student class
		
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
}

class Student extends Human {
	private int id;
	private String varsity;
	public Student(String name, int age, int id, String varsity) {
		// generally we cannot access the private variable of the super class
		// but using super keyword we can access it
		super(name, age); // it should be first 
		this.id = id;
		this.varsity = varsity;
		// super(name, age); constructor call must be first in the method
	}
}
