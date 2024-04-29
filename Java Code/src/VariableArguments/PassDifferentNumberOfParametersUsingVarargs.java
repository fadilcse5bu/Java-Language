package VariableArguments;

public class PassDifferentNumberOfParametersUsingVarargs {
	public static void main(String[] args) {
		A obj = new A();
		int sum = obj.add(10, 20);
		System.out.println(sum);
		
		sum = obj.add(10, 20, 30, 40);
		System.out.println(sum);
		
		obj.print("Saidul", "Fadil");
		obj.print("Saidul", "Fail", "Golam Rabby");
	}
}

class A {
	int add(int ...n) { // here is a one dimensional array
		int sum = 0;
		for(int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return sum;
	}
	
	void print(String ...name) {
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}