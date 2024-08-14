package Karthi;

class A
{
	int a=10;
	A(String name)
	{
		System.out.println("Welcome"+name);
	}
	void myMethod()
	{
		System.out.println("I am Super Class Method");
	}
}
class B extends A
{
	B()
	{
		super("karthi");
	}
	void myMethod2()
	{
		System.out.println("Super class Variable:"+super.a);
		super.myMethod();
	}
}
public class SuperKeyWord {
public static void main(String [] args)
{
	B ob=new B();
	ob.myMethod2();
}
}
