package Day_2;


//this keyword in java
public class Main4 {
	String name;
	Main4(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	Main4(int a, int b){
		System.out.println("Addition : "+(a+b));
	}
	void greeting() {
		System.out.println("Welcome  "+ name);
	}
	public static void main(String[] args) {
	Main4 obj =new Main4 ("Jeeva");
	} 

}
