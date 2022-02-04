
package Arry;

public class Thane {

	public static void main(String[] args) {
		String a="thane city and pune city is huge";
		String r[]=a.split("city");
		
		System.out.println(r[0]);
		System.out.println(r[1]);
		System.out.println(r[2]);
		
		System.out.println(a.indexOf("city"));
		System.out.println(a.indexOf("d"));
		
		System.out.println(a.lastIndexOf("city"));
		System.out.println(a.lastIndexOf("t"));
		
		
		String b="super";
		String c=new String("sub");
		String d="";
		
		System.out.println(b +" class");
		System.out.println(c.concat(" class"));
		
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(d.isEmpty());
	}
	

}
