package Karthi;

public class Employee 
{
	String EmpName;
	String JobTitle;
	int Salary;
	
	Employee(String Name,String Role,int salary)
	{
		this.EmpName=Name;
		this.JobTitle=Role;
		this.Salary=salary;
		System.out.println("Employee Name:"+EmpName);
		System.out.println("Employee JobTitle:"+JobTitle);
		System.out.println("Employee Salary:"+Salary);
		
	}
	void Calculate(int percent)
	{
		int PerDay=this.Salary/30;
		this.Salary=this.Salary+PerDay*percent;
	}
	void Update()
	{
		System.out.println("Employee Name:"+EmpName);
		System.out.println("Employee JobTitle:"+JobTitle);
		System.out.println("Employee Salary:"+Salary);
	}
public static void main(String[] args)
{
	Employee e1 = new Employee("Karthi","FrontEnd Developer",50000);
	e1.Calculate(3);
	System.out.println("After Updation");
	e1.Update();
}
}
