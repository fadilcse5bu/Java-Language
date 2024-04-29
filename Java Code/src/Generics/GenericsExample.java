package Generics;

public class GenericsExample {
	public static void main(String[] a) {
		Printer<Integer> p1 = new Printer<>(23);
		p1.print();
		
		Printer<Double> p2 = new Printer<>(23.5);
		p2.print();
		
		Printer<String> p3 = new Printer<>("This is String type parameter");
		p3.print();
	}
}
