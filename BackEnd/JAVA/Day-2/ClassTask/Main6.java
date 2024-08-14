package Day_2;

//Constructor Overloading

public class Main6 {
	Main6 (String name) {
		System.out.println("welcome " +name);
	}
	Main6 (int a, int b) {
		this("Jeeva");
		System.out.println("Sum is: " +(a+b));
	}
	Main6 (int n) {
		this(10,20);
		System.out.println("welcome " +n);
		
	}

	public static void main(String[] args) {
//		Main6 obj =new Main6("Jeeva");
//		Main6 obj1 =new Main6(10,20);
//		Main6 obj2 =new Main6(20);
		
		Main6 obj3 =new Main6(20);

	}

}
