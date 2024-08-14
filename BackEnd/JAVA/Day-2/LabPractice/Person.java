package Karthi;

 class Person
{
	int PersonAge;
	String PersonName;
	
	Person(int Age,String Name)
	{
		this.PersonAge=Age;
		this.PersonName=Name;
		
	}
	
	void Display()
	{
		System.out.println("PERSON'S NAME:"+this.PersonName);
		System.out.println("PERSON'S AGE:"+	this.PersonAge);
		
	}

	public static void main(String [] args)
	{
		 Person p1= new Person (21,"Karthi");
		 Person p2= new Person (21,"Riyas");
		 
		 p1.Display();
		 p2.Display();
		
	}
	
}
