package Arry;

public class Pune {

	public static void main(String[] args) {
		String a="velocity";
		String b="velocity";
		
		String c=new String("velocity");
		String d=new String("velocity");
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		b="velocity class";
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a==b);
		
		
		int x=a.length();
		System.out.println(x);
		System.out.println(a.length());
		
		System.out.println(a.charAt(0));
		
		System.out.println(a);
		
		a=a.toUpperCase();
		System.out.println(a);
	   
		a=a.toLowerCase();
		System.out.println(a);
		
		b="velocity class";
		System.out.println(b);
		System.out.println(b.substring(5));
		System.out.println(b.substring(3,11));    //3to10
		
		
		String f="   java class   ";
		System.out.println(f.length());
		System.out.println(f);
		
		System.out.println(f.trim());          //remove starting and ending space only
		
		  
	}

}
