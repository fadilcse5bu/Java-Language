package VariableArguments;

public class MoreOfVariableArgument {
	public static void main(String[] args) {
		AA obj = new AA();
		obj.print("Saidul", 10, 20);
		obj.print(1);
		// obj.print(3,  4); // it's ambiguous, because both the last 2 methods should be called but that's not possible
	}
}

class AA {
	void print(String name, int ...n) {
		System.out.printf("%s ", name);
		for(int i = 0; i < n.length; i++) {
			System.out.printf("%s ", n[i]);
		}
		System.out.println();
	}
	// void print1(int ...n, String name); //variable argument should be last among all the parameters
	void print(int x, int ...n) {
		System.out.println("print2 is called");
	}
	void print(int x, int y, int ...n) {
		
	}
}
