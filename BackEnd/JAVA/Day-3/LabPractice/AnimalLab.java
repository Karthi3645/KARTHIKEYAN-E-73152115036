package Karthi;

 class Animal 
{
	void MakeSound()
	{
		System.out.println("sound of Animal");
	}
}
class Cat extends Animal
{
	void MakeSound()
	{
		System.out.println("Bark");
		
	}
		
}

public class AnimalLab 
{
	public static void main(String [] args)
	{
		Animal c1=new Cat();
		c1.MakeSound();
	}

}
