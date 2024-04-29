package Anonymous;

public class AnonymousClassAndObject {
	public static void main(String[]  args) {
		new A().print1(); // Anonymous object
		System.out.println(new A().x); // print the value of x using anonymous object
		
		A obj = new A() {
			void print1() {
				System.out.println("Print1 Function overrided by anonymous class");
				print();
			}
			void print() { // we cannot use this method outside this
				System.out.println("Inner method of the anonymous class");
			}
		};
		obj.print1();
		obj.print2();
		
		A obj2 = new A();
		obj2.print1();
	}
}

class A {
	int x = 10;
	void print1() {
		System.out.println("Print1 Function");
	}
	void print2() {
		System.out.println("Print2 Fucntion");
	}
}
