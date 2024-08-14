package Day_2;

//Type of variable
public class Main2 {
	int b=20;  //instance Variables
	static int c=30; //Static Variables
	
	
	public static void main(String[] args) {
		int a=10;  //Local Variables
		System.out.println("Local Variable : " + a);

		Main2 obj=new Main2();
		System.out.println(obj.b);
		System.out.println(c);
	}

}
