import java.util.InputMismatchException;
import java.util.Scanner;
public class CustomeException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CustomeException(String message) {
		super(message);
	}
}
class test{
	public static void main(String[] args) throws CustomeException{
		Scanner console = new Scanner(System.in);
		
		int age;
		int quit = 0;
	
	 do {
		try {
			System.out.print("Enter your Age: ");
			age = console.nextInt();
			CheckAge(age);
			System.out.print("Enter 1 to continue enter 2 to exit");
			quit = console.nextInt();
			
		}
		catch(InputMismatchException ce) {
				throw new CustomeException("Na unsa man ka uy naa diay age nga character or word? mao nani ron");
			}
		catch(Exception e) {
			System.out.println("sayup jud dol"+ e.toString());
		}
	 }while(quit!=2);
}
	public static void CheckAge(int age) throws CustomeException{

		if(age >=18) {
			System.out.println("\n\tLegal Age\n");
		}
		else if(age<18) {
			System.out.println("\n\tNot legal age\n");
		}	
	}
}	