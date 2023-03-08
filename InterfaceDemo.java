/*Interface- It is syntatically similar to class, but it is not a class.
 * Since, it is not a class, we can not create object.
 * By default, all the methods of the interface are ABSTRACT.
 * To define methods of Interface class must have to implement an Interface using IMPLEMENT keyword.
 * One class implements an interface, class must have to define all the methods of the interface.
 * One class can implement more than one interface.
 * One interface can me implemented my multiple classes.
 * Inheritance of interface is also possible.
 * 
 * 
 * */


interface ifs1
{
	static void meth1()
	{
		System.out.println("Meth1 in Interface.");
	}
}

interface ifs2 extends ifs1
{
	void meth2();
}
class ImplInterface implements ifs2
{

		public void meth2() {
	System.out.println();
		
	}	
}
public class InterfaceDemo implements ifs1,ifs2{
	
	
	public void meth2() {
	System.out.println("Meth2.");
	}	
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.meth2();
		ifs1.meth1();
	}
	

	

	
}
