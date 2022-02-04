package Assingment;

import java.util.Arrays;
import java.util.Collections;

public class Largestarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Integer [] array = {1,2,4,5};
	        Arrays.sort(array, Collections.reverseOrder());
	        Arrays.asList(array).forEach(e-> System.out.print(e+" "));
	}

}
