package Super;

public class FunctionCallUsingSuperKeyword {
	public static void main(String[] args) {
		Male m = new Male();
		m.p();
	}
}

class Man {
	public void p() {
		System.out.println("I am Man");
	}
	public void f1() {
		System.out.println("I am from Man");
	}
}

class Male extends Man {
	public void p() {
		super.p();
		System.out.println("I am Male");
		f1(); // the java JVM first search the function in its own class then super class
		super.f1(); // to specify the super class
	}
	public void f1() {
		System.out.println("I am from Male");
	}
}