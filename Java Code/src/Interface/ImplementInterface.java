package Interface;

public class ImplementInterface {
	public static void main(String[] args) {
		Impl obj = new Impl(); // create an object of Impl class 
		// as we cannot create object of interface AA or BB or CC directly
		obj.print2();
		// System.out.println(obj.x); // cannot access static variable x directly
		obj.printX();
	}
}

interface AA {
	int x = 10;
	void print1();
}
interface BB {
	int y = 20;
	public abstract void print2();
}
interface CC {
	public final static int y = 30;
	void print3();
}

class Impl implements AA, BB, CC {
	// must have to implement all the methods of all the inherited interface
	public void print1() {
		System.out.println("Implementation of print1 method of interface AA");
	}
	public void print2() {
		System.out.println("Implementation of print2 method of interface BB");
	}
	public void print3() {
		System.out.println("Implementation of print3 method of interface CC");
	}
	public void printX() {
		System.out.println(x);
	}
	public void printY() {
		// System.out.println(y); // as y variable in both interface AA, BB
		// accessing of y is ambiguous.
	}
	
}