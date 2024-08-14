package Karthi;
class Shape
{
	void GetArea(float l,float b)
	{
		System.out.println("Area of the Sahape");
	}
}
class Rectangle extends Shape
{
	
	void GetArea(float l,float b)
	{
		System.out.println("Area of the Rectangle:"+l*b);
	}
}
public class ShapeLab
{
	public static void main(String [] args)
	{
		Shape s1 = new Rectangle();
		s1.GetArea(5,3);
	}

}
