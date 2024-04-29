package Final;

public class FinalKeyword {
	public static void main(String[] args) {
		final int x; // declared a blank final variable 
		x = 10; // initialised the final variable
		// x = 15; final variable cannot be re-initialised. It's like as constant in c++
		System.out.printf("Value of x = %s%n", x);
		
		A objA = new A();
		objA.print();
		objA.print1();
		
		B objB = new B();
		objB.print1();
	}
}

class A {
	public final void print() {
		System.out.println("A");
	}
	public void print1() {
		System.out.println("A");
	}
}

class B extends A {
	// public void print() {};  it cannot override final method 
	public void print1() {
		System.out.println("B");
	}
}

final class C {}
// class D extends C{}; final class cannot be extended

