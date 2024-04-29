package Abstraction;

public class CreateObjectOfAbstractClass {
	public static void main(String[] args) {
		A obj = new A();
		obj.print2();
		
		B obj2 = new B() {
			public void print2() {
				System.out.println("Create object in another way");
			}
		};
		obj2.print2();
	}
}

class A extends B {
	public void print2() {
		System.out.println("Defined in A class");
	}
}

abstract class B {
	public void print1() {
		
	}
	public abstract void print2();
}
