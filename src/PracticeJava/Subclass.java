package PracticeJava;

public class Subclass extends Superclass{
	
	void test() {
		System.out.println("subclassmethod");
	}
	
	static void demo() {
		System.out.println("static method");
	}
	
	

	public static void main(String[] args) {
		Subclass obj=new Subclass();
		obj.test();
	
		Superclass x=new Superclass();
		x.test();
		
		Subclass.demo();

	}

}
