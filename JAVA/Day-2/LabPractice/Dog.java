package Karthi;

public class Dog 
{
	String DogName;
	String DogBreed;
	
	Dog(String Name,String Breed)
	{
		this.DogName=Name;
		this.DogBreed=Breed;
	}
	void Display()
	{
		System.out.println("Dog Name:"+this.DogName);
		System.out.println("Dog Breed:"+this.DogBreed);
		
	}
	
	public void setvariable(String Breed)
	{
		this.DogBreed=Breed;
	}
	public static void main(String [] args)
	{
		Dog d1=new Dog("jimmy","Boxer");
		Dog d2=new Dog("raju","BullDog");
		
		d1.Display();
		d2.Display();
		
		System.out.println("After Setter Function");
		d1.setvariable("German Shepherd");
		d2.setvariable("Poodle");
		
		d1.Display();
		d2.Display();
	}
}
