package Static;

public class StaticVariable {
	public static void main(String[] a) {
		student s1 = new student();
		s1.roll = 1;
		s1.name = "A";
		s1.year = 2023;
		
		student s2 = new student();
		s2.roll = 2;
		s2.name = "B";
		s2.year = 2024;
		
		System.out.println(s1.year);
		
		student.year = 2025;
		
		System.out.println(s1.year);
		student.print();
	}
}

class student {
	int roll;
	String name;
	static int year; // static variable is common for all the object of this class
	
	static void print() {
		// roll = 3;  // static function cannot access non-static variable
		year = 2026;
		System.out.println(year);
	}
}
