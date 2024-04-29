package Anonymous;

public class ObjectOfInterfaceAndAbstractUsingAnonymous{
	public static void main(String[] args) {
		BB obj = new BB() {
			public void print3() {
				System.out.println("This is print3 method");
			}
		};
		obj.print3();
		obj.print4();
		
		AA obj2 = new AA() {
			public void print1() {
				System.out.println("This is print1 method");
			}
			public void print2() {
				System.out.println("This is print2 method");
			}
		};
		obj2.print2();
	}
}

interface AA {
	int x = 10;
	void print1();
	void print2();
}

abstract class BB {
	abstract public void print3();
	void print4() { // default package-private access modifier // not accessible outside of this package
		System.out.println("This is print4 method");
	}
}