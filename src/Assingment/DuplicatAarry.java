package Assingment;

public class DuplicatAarry {

	public static void main(String[] args) {
		
		  int a[]= {1,2,3,4,5};
	         int b[]= {1,9,3,8,5};
	         
	         for(int i=0; i<a.length; i++) {
	        	 for(int j=0; j<b.length; j++) {
	        		if(a[i]==b[j]) {
	        			System.out.print(a[i]+" ");
	        		}
	        	 }
	         }

	}

}
