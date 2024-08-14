package Karthi;
class Emp
{
	void work()
	{
		System.out.println("job Role");
	}
	void GetSalary()
	{
		System.out.println("Salary is based on job role");
	}
}
class HrManager extends Emp
{
	void work()
	{
		System.out.println("HR Manager");
	}
	void AddEmployee()
	{
		System.out.println("Employee Name Karthi");
	}
}
public class EmployeeLab 
{
	public static void main(String [] args)
	{
		Emp e1=new HrManager();
		HrManager h1 = new HrManager();
		e1.work();
		h1.AddEmployee();
	}

}
