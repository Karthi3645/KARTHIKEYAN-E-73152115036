package Karthi;

class Vehicle
{
	
	void NoofEngine()
	{
		System.out.println("I Have One Engine");
	}
}

 class TwoWheel extends Vehicle
{
	
	void NoofWheela()
	{
		System.out.println("I Have Two Wheels");
	}
}
class Bike extends TwoWheel
{
	void BrandName()
	{
		System.out.println("Brand Name is Honda");
	}
}	
class Scooty extends TwoWheel
{
	void BrandName()
	{
		System.out.println("Brand Name is Activa");
	}
}	


public class TwoWheeler
{
	public static void main(String [] args)
	{
		Bike bike = new Bike();
		bike.NoofEngine();
		bike.NoofWheela();
		bike.BrandName();
		
		Scooty sc= new Scooty();
		sc.NoofEngine();
		sc.NoofWheela();
		sc.BrandName();
	}
}