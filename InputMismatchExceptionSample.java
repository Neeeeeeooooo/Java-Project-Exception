import java.util.Scanner;
import java.util.InputMismatchException;
public class InputMismatchExceptionSample {

	public static void main(String[] args) {
		
		Scanner console =new Scanner(System.in);

		int age;
		
		try {
			System.out.print("Please enter your age: ");
			age=console.nextInt();
			
			if(age >=18)
				System.out.println("Legal age");
			else if((age <= 17) && (age >1)) {
				System.out.println("Not Legal age");
			}
			else
				System.out.println("walay age nga negative");
		}catch(InputMismatchException IME) {
			System.out.println("Sayup ka dire: " + IME.toString());
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
