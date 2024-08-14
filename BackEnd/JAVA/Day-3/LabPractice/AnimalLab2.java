package Karthi;

class Animal1
{
	void move()
	{
		System.out.println("Movement of animal");
	}
}
class Chetah extends Animal1
{
	void move()
	{
		System.out.println("Run");
	}
}
public class AnimalLab2 
{
	public static void main(String [] args)
	{
		Animal1 a1=new Chetah();
		a1.move();
		
	}
}
