package PracticeJava;

public class Superclass {
	
	void test() {
		System.out.println("superclassmethod");
	}
	static void demo() {
		System.out.println("super static method");
	}
	

	public static void main(String[] args) {
	 
		Superclass x=new Superclass();
		x.test();

	}

}
