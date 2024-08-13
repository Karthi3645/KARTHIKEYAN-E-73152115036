package Karthi;

public class Circle 
{
	float CircleRadius;
	float pi=3.14f;
	
	Circle(float radius)
	{
		this.CircleRadius=radius;
		System.out.println("Radius of the Circle:"+this.CircleRadius);
	}
	void Circumference()
	{
		System.out.println("Circumference of the Circle:"+2*this.CircleRadius*pi);
	}
	void Area()
	{
		System.out.println("Area of the Circle:"+pi*this.CircleRadius*this.CircleRadius);
	}
	public static void main(String [] args )
	{
		Circle c1=new Circle(5);
		c1.Circumference();
		c1.Area();
	}
}
