package Interface;

public class InheritInterface {
	public static void main(String[] args) {
		Imp obj = new Imp();
		obj.printX();
		obj.printY();
	}
}

interface A {
	int x = 10;
	void print1();
}

interface B extends A{
	int y = 10;
	void print2();
}

interface C extends B {
	int x = 20;
	void print3();
}

class Imp implements C {
	public void print1() {
		
	}
	public void print2() {
		
	}
	public void print3() {
		
	}
	public void printX() {
		System.out.println(x);
	}
	public void printY() {
		System.out.println(y);
	}
}