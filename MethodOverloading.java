
public class MethodOverloading {
	void test()
	{
		System.out.println("test with 0 arguments.");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument.");
	}
	void test(int a,int b)
	{
		System.out.println("test with 2 arguments.");
	}
	public static void main(String[] args) {
		MethodOverloading m =new MethodOverloading();
		m.test();
		m.test(0);
		m.test(10,20);
		
	}

}
