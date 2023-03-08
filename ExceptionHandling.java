import java.util.InputMismatchException;
import java.util.Scanner;

/*Exception
 * An abnormal situation that arises during the run time of a program is called EXCEPTION.
 * 1. try.
 * 2. catch,
 * 3. throw.
 * 4. throws.
 * 5. finally.
 * are used for exception handling.
 * Throwable class- 1) Error Class
 * 					2) Exception Class- Runtime exception
 * Two types of Exception- CHECKED & UNCHECKED Exception.
 * Compile time is called CHECKED Exception.
 * Run Time is called UNCHECKED Exception. 
 * */



public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start Code.");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.print("Enter A: ");
		a=sc.nextInt();
		
		System.out.print("Enter B: ");
		b=sc.nextInt();
		
		c=a/b;
		System.out.println("Division is: "+c);
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int index;
		System.out.print("Enter Index number:");
		index=sc.nextInt();
		System.out.println("The value is: "+arr[index]);
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid Index value.");
		}
		catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}	
		catch (InputMismatchException e) {
			System.out.println("Please enter integer value");
		}
		System.out.println("End code.");
		}
	}
	
