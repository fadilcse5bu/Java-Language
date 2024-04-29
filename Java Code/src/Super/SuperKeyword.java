package Super;

public class SuperKeyword {
	public static void main(String[] arg) {
		B obj = new B();
		obj.printx();
		
		C obj2 = new C();
		obj2.printy();
	}
}

class A {
	int x = 10;
	int y = 15;
}

class B extends A {
	int y = 20;
	public void printx() {
		int x = 30;
		int y = 10;
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(y);
	}
}

class C extends B {
	int y = 1;
	public void printy() {
		System.out.println(y);
		System.out.println(super.y);
		// System.out.println(super.super.y); 
		// super.super is not allowed.
	    // because it violates encapsulation and can lead to potential security and integrity issues.
	}
}