package Demopack;

import DemoPack2.Dog;

class ASub {
	public int a = 100;
	int b = 200;
	protected int c = 300;
	private int d = 400;   // can not call in other class
}


public class ClassA extends Dog {
	
	
	public static int a = 10;
	static int b = 20;
	private static int c = 30;
	protected static int d = 40;
	
	
	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		ASub a = new ASub();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		
	    		
		
	}

}
