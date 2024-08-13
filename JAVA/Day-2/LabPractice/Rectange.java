package Karthi;

public class Rectange 
{
	float RectangleHeight;
	float RectangleWidth;
	
	Rectange(float Height,float Width)
	{
		this.RectangleHeight=Height;
		this.RectangleWidth=Width;
		System.out.println("Height  of Rectangle:"+this.RectangleHeight+"\n Width  of Rectangle:"+this.RectangleWidth);
		
	}
	void Area()
	{
		System.out.println("Area of Rectangle:"+(this.RectangleHeight*this.RectangleWidth));
	}
	void perimeter()
	{
		System.out.println("Perimeter of Rectangle:"+2*(this.RectangleHeight+this.RectangleWidth));
	}
public static void main(String [] args)
{
	Rectange r1=new Rectange(5,8);
	r1.Area();
	r1.perimeter();
}
}
