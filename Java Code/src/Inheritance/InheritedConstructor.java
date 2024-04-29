package Inheritance;

public class InheritedConstructor {
	public static void main(String[] arg) {
		Third obj = new Third();
	}
}

class First {
	public First() {
		System.out.println("Constructor of First 1");
	}
	public First(int x) {
		System.out.println("Constructor of First 2");
	}
}

class Second extends First {
	public Second() {
		//super(); //by default super() is called before this constructor to call the Parent/Super class constructor
		System.out.println("Constructor of Second 1");
	}
	public Second(int x) {
		super(1);
		System.out.println("Constructor of Second 2");
	}
}

class Third extends Second {
	public Third() {
		super(1);
		System.out.println("Constructor of Third 1");
	}
	public Third(int x) {
		System.out.println("Constructor of Third 2");
	}
}

class Forth {
	// while we create a constructor, the default constructor will be inactive
	public Forth(int x) { 
		
	}
}