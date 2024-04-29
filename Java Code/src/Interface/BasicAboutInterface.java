package Interface;

public class BasicAboutInterface {
	public static void main(String[] args) {
		// I obj = new I(); // interface has no constructor, so we cannot create object directly
	}
}

interface I {
	// int y; // every variable should be initialised
	// int y = 10; // public final static is hidden 
	public final static int x = 10; // default variable type;
	public abstract void print(); // default method type
	// void print() {} // we cannot provide definition of the method in this interface
	
	// public A() {} // interface is not a class, so it has not constructor
}