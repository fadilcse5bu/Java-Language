package ExceptionHandling;

import java.util.Scanner;
public class CustomException {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		try {
			if(x > 10) {
				throw new MyException("The number is greater than 10");
			}
			else {
				System.out.println("The number is less than or equal to 10");
			}
		}
		catch(MyException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
class MyException extends Exception {
	MyException(String mg) {
		super(mg);
	}
}
