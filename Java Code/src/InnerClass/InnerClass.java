package InnerClass;

public class InnerClass {
	public static void main(String[] arg) {
		outerClass outerObj = new outerClass();
		outerObj.x = 10;
		outerClass.innerClass innerObj = outerObj.new innerClass();
		innerObj.y = 20;
		
		System.out.printf("Outer Variable x = %s%nInner Variable y = %s%n", outerObj.x, innerObj.y);
		System.out.printf("Inner Variable z = %s%n", innerObj.z);
		
		innerObj.print2();
	}
}

class outerClass {
	int x;
	public void print1() {
		System.out.printf("Outer Class Method%n");
	}
	class innerClass {
		int y;
		int z = x+5;
		public void print2() {
			System.out.printf("Inner Class Method%n");
			print1();
		}
	}
}
