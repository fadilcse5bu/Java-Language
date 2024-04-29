package Static;

public class StaticBlock {
    static {
    	System.out.println("Static Block 1");
    	int z = 13;
    }
    
	static int x = 10;
	int y = 5;
	static {
		x = 15;
		System.out.println("Static Block 2");
	}
	
	public static void main(String [] a) {
		System.out.println(x);
		// z = 15;  here z is not from block 1
		// y = 10; main is static method that cannot access non-static variable
	}
	
	static {
		System.out.println("Static Block 3");
	}
	
}
