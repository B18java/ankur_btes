package src1;
class A
{
	final static int a=100;
	A()
	{
		System.out.println("in parent class overloaded constructor");
	}
	void sum(int x,int y)
	{
		System.out.println("Parent class method");
		System.out.println(x+y);
	}
	void disp()
	{
		System.out.println("Hello");
	}
	}
class B extends A
{
	int a;
	B()
	{
		super();
		System.out.println("in child class constructor");
	}
	B(String y)
	{
		super();
		System.out.println("in child class overloaded constructor");
	}
	void show()
	{
		System.out.println(super.a);
	}
	void sum(int x,int y)
	{
		if(x<100 && y<100)
			super.sum(x,y);
		else
		{
			System.out.println("child class method");
			System.out.println(x+y);
		
	


		}
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new B();
a1.sum(10, 20);
a1.disp();
	}

}
