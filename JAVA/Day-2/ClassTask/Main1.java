package Day_2;

//Class and Object
class Employee {
	
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	
	//constructor
	Employee(int employeeId,String employeeName , float employeeSalary ){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	//method
	void display () {
		System.out.println("Employee Id :"  +employeeId);
		System.out.println("Employee Name :"  +employeeName);
		System.out.println("Employee Salary :"  +employeeSalary);
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		Employee emp =new Employee(33,"Jeeva",2000.0f);
		emp.display();
		
		Employee emp1 =new Employee(34,"Karthi",200.0f);
		emp1.display();
		
	}
}
