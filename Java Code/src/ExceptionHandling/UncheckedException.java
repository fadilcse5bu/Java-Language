package ExceptionHandling;
// exception is like an error but not
// is occurred while running the code
// it doesn't show any compilation error
public class UncheckedException {
	public static void main(String[] args) {
		// Object obj = "Hello";
		// Integer num = (Integer)obj; // Here this is ClassCastException
		// String str = "abc";
		// int num = Integer.parseInt(str); // this is NumberFormatException
		// String name = null;
		// System.out.println(name.length()); // this is NullPointer Exception
		
		// Exception be handled otherwise the program will be terminated
		// we can handle any exception using try catch block and using throws keyword
		
		int a[] = new int[10]; // as this doesn't occur any exception we can safely write this out of try catch block 
		try {
			a[10] = 10; // this is ArrayIndexOutOfBounds exception
			int k = 5/0; // this is Arithmetic Exception but the compiler will jump from the above exception outside the try catch block 
			System.out.println(k); // So this will not be printed
		}
		catch(ArithmeticException e) {
			System.out.println("This is Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) { // caught the exception and handled it
			System.out.println("This is ArrayIndexOutOfBounds Exception");
		}
		catch(Exception e) { 
			System.out.println(e); // this is default exception
			// if we don't mention exception this block will catch the exception
		}
		finally {
			System.out.println("Exception is handled");
			// finally block will be always executed whether an exception occurred or not
		}
		
		System.out.println("This is the outer section of the try catch block");
	}
}




