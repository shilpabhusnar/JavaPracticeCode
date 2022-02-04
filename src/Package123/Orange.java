package Package123;

public class Orange implements Kiwi{
	
	public void red(){
 	   System.out.println("hi");
	}

	public void blue() 
	{
		System.out.println("bye");
	}
    
	public void yellow() 
	{
		System.out.println("bye");
	}

      

 	   public static void main(String[] args) {
		
       
       Kiwi y=new Orange();
       y.red();
       y.blue();
       System.out.println(Kiwi.a);
       
       Kiwi.pink();
       y.yellow();
	}

}
