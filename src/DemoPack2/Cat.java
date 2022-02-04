package DemoPack2;

public class Cat extends Dog {
	static int a = 10;
	int b = 20;

	void superclass() {
	
		System.out.println("hi");
	}

	public static void main(String[] args) {

		Cat x=new Cat();
		Dog y=new Dog();
		y.superclass();
		
		System.out.println(Cat.a);
		System.out.println(x.b);
		
		Cat.alpha();
		Cat.beta();
		
		x.creta();
		x.delta();
		x.flex();
		
		
	}
}