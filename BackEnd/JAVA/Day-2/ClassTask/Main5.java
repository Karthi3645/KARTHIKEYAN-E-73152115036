package Day_2;

//Method Overloading

public class Main5 {
	void MyMethod(String name) {
		System.out.println("welcome " +name);
	}
	void MyMethod(int a, int b) {
		System.out.println("Sum is: " +(a+b));
	}
	void MyMethod(int n) {
		System.out.println("welcome " +n);
	}

	public static void main(String[] args) {
		Main5 obj =new Main5();
		obj.MyMethod("Jeeva");
		obj.MyMethod(10,20);
		obj.MyMethod(20);

	}

}
