class Box
{
	double width, height, length;
	Box()
	{
		System.out.println("Default Cunstructor Called");
		width=4;
		height=5;
		length=6;		
	}
	Box(int w,int h,int l)
	{
		System.out.println("Parameterized Constructor Called");
		width=w;
		height=h;
		length=l;
	}
	Box(Box abc)
	{
		System.out.println("Copy Constructor Called");
		width=abc.width;
		height=abc.height;
		length=abc.length;
	}
	void Volume()
	{
		System.out.println("The volume is: "+(width*height*length));
	}
}
public class CunstructorDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.Volume();
		
		Box b2=new Box(5,6,7);
		b2.Volume();
		
		Box b3=new Box(b1);
	}

}
