package Karthi;

class VehicleProgram
{
	void drive()
	{
		System.out.println("Status of your Vehicle");
	}
}
class Car extends VehicleProgram
{
	void drive()
	{
		System.out.println("Repairing a car");
	}
}
public class VehicleLab 
{
	public static void main(String [] args)
	{
	VehicleProgram v1 = new Car();
	v1.drive();
	}
	

}
