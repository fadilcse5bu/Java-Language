package Inheritance;

public class Inheritance {
	public static void main(String[] arg) {
		A obj = new B();
		obj.print(); // method overriding
		System.out.println(obj.x);
		System.out.println(obj.toString()); // obj.toString() is from Object class
		
		B obj2 = new B();
		System.out.println(obj2.x); // variable overriding
		
		A obj3 = new A() {
			public void print() {
				System.out.println("Overrided print method without extend class");
			}
		};
		obj3.print();
	}
}

class A extends Object { // every class by default extend Object class
	int x = 10;
	public void print() {
		System.out.println("A");
	}
}

class B extends A {
	int x = 5;
	int y = 10;
	public void print() {
		System.out.println("B");
	}
}

// class C extends A, B{}; a class cannot extend multiple class in java