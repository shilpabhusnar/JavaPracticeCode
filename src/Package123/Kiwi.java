package Package123;

public interface Kiwi {
	
	int a=5;     //public static final
	
	void red();  //abstract method
	void blue();
	
	
	static void pink() {
		System.out.println("this is static");
	}
	
	default void yellow() {
		System.out.println("default method in interface");
	}
		
		
		
	}

