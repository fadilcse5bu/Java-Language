package Encapsulation;

public class SecuredEmploySalary {
	public static void main(String [] arg) {
		Employee e = new Employee();
		
		e.changeName(1010, "Fadil");
		String name = e.getName(1010);
		System.out.println(name);
		
		e.changeName(1010, "Golam Rabby");
		name = e.getName(1010);
		System.out.println(name);
		
		e.changeName(1000, "Saidul");
		
		int salary = e.getSalary(1010);
		System.out.printf("Salary is %s%n", salary);
		
		salary = e.getSalary(1001);
	}
}

class Employee {
	private int id = 1010;
	private int salary = 40000;
	private String name = "Saidul";
	
	public void changeName(int id, String name) {
		if(this.id == id) {
			this.name = new String();
			this.name  = name;
			System.out.println("Changed Name Successfully");
		}
		else {
			System.out.println("Your id is not correct");
		}
	}
	
	public String getName(int id) {
		if(this.id == id) return "Your Current Name is " + this.name;
		else return "id is not correct";
	}
	
	public int getSalary(int id) {
		if(this.id == id) {
			return salary;
		}
		else {
			System.out.println("Your id is not correct");
			return -1;
		}
	}
}
