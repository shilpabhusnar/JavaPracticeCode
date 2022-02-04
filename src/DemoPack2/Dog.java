package DemoPack2;

public class Dog {
	
	static int a=100;
		int b=200;
		
	public static void alpha () {
		
		System.out.println("static");
	}
	
	static void beta () {
		System.out.println("non static");
	}
	
	protected static void creta () {
		System.out.println("inheritance");
	}
	
	public void delta()
	{
		System.out.println("non static");
	}
	
	protected void flex() {
		System.out.println("non static inheritance ");
	}
	
	 void superclass() {
		 System.out.println("hello");
	 }
	
	public static void main(String[] args) {
	Dog.alpha();
	Dog.beta();
		
	}

}
