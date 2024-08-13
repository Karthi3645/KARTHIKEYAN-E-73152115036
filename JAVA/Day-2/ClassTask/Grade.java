package Day_2;
import java.util.*;

class student{
	int registerNumber;
	String stutdntName;
	int marks[]= new int[5];
	int sum,avg;
	String grade;
	
	student (int registerNumber ,String stutdntName) {
		this.registerNumber=registerNumber;
		this.stutdntName=stutdntName;
	}
	
	void getMark(){
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Marks");
		for(int i=0;i<marks.length;i++) {
			this.marks[i]=sc.nextInt();
		}
		this.calculateGrade();
	}
	
	void calculateGrade() {
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		
		avg=sum/(marks.length);
		if(avg<45) 
		 this.grade="Fail";
		if(avg>=45&&avg<65) 
			 this.grade="C";
		if(avg>=65&&avg<85) 
			 this.grade="B";
		if(avg>=85) 
			 this.grade="A";	
	}
	void display() {
		System.out.println("Your Regester Number : "+registerNumber);
		System.out.println("Your Regester Name : "+stutdntName);
		System.out.println("Your grade is : "+grade);
	}

}
public class Grade {
	public static void main(String[] args) {
		student s=new student(33 ,"Jeeva");
		s.getMark();
		s.display();
		
	}
}