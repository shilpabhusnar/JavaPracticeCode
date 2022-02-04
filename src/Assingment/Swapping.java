
package Assingment;

public class Swapping {

	public static void main(String[] args) {
		int x=600;
		int y=400;
		x=x+y;
		System.out.println(x);
		
		int p=20;
		int q=30;
		
		p=p+q;  //50
		q=p-q;  //50-30=20
		p=p-q;  //50-20=30 
		
		System.out.println(p);
		System.out.println(q);
		
		//third 
		p=p^q;
		q=p^q;
		p=p^q;
		System.out.println(p);
		System.out.println(q);
		
		// single statement
		int i=70;
		int j=60;
		
		j=i+j-(i=j);
	     
	     System.out.println(i);
	     System.out.println(j);
	     
		
		
	}

}
