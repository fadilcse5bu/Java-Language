package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwsKeyword {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("text.txt");
		// here we show an error because this is checked exception
		Scanner sc = new Scanner(f); // to suppress the Exception we use throws keyword after the function name
		sc.close();
		// now we cannot see the error but the exception is not handled yet.
		// let's see this
		
		System.out.println("Exception is handled");
		// this line is not executed because the previous exception is not handled so the program is terminated
	
		A obj = new A();
		// obj.print1(); // this method can give us an checked exception as by default Exception class is a checked exception
		// so we have to suppress the exception using throws keyword or try catch block
		obj.print2();
		// here we don't show any error because the method can give unchecked exception
	}
}

class A {
	public void print1() throws Exception {
		
	}
	public void print2() throws RuntimeException {
		System.out.println("This is uncheked exception");
	}
}