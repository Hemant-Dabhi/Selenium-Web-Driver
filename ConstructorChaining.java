/*Polymorphism- One name multiple form.
 * 1) Runtime- Method over loading- When there is a same method in base class as well as derived class and 
 * you call that method using object of derived class, them only derived class method will be called. So 
 * you can say that method of derived class overrides method of base class.   
 * 
 * 2) Compile Time Polymorphism- Method Overloading- When there is a more than one method in same class 
 * having the same name with different number of arguments and their data types, then it is called 
 * Method Overloading. 
 * 
 * Super Keyword- It is used to call Variables, method and Constructors from your derived calss to 
 * base class.
 * 
 * */

class A1
	{
		A1()
		{
			System.out.println("Default Constructor Called.");
		}
		void show()
		{
			System.out.println("Show from A1.");
		}
	}
	class A2 extends A1
	{
		A2()
		{
			System.out.println("A2's Default Constructor.");
		}
		void show()
		{
			super.show();
			System.out.println("Show from A2.");
		}
	}
	class A3 extends A2
	{
		A3()
		{
			System.out.println("A3's Default Constructor.");
		}
		void show()
		{
			super.show();
			System.out.println("Show from A3.");
		}
	}

public class ConstructorChaining {
	
	public static void main(String[] args) {
		A3 a=new A3();
		a.show();
		
	}

}
