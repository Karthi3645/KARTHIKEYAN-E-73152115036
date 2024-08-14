package Karthi;
class person
{
	void getFirstName(String Name)
	{
		System.out.println("Employee Name:"+Name);
	}
	void lastFirstName(String Name)
	{
		System.out.println("Employee Role:"+Name);
	}
	
}
class Empl extends person
{
	void EmployeeId(int id)
	{
		System.out.println("Employee Id:"+id);
	}
	void lastFirstName(String Name)
	{
		super.getFirstName("Karthi");
		EmployeeId(101);
		System.out.println("Employee Role:"+Name);
	}
}

public class LabPractice7 
{
	public static void main(String [] args)
	{
		
		person p1=new Empl();
		
		p1.lastFirstName("Full Stack Developer");
	}
}
