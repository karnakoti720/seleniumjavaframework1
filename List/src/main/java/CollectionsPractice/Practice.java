package CollectionsPractice;


import java.util.Vector;

import org.testng.annotations.Test;

public class Practice {
	
	
		
		
		@Test
		public void m1() {
		
		Vector<String> V1= new Vector();
		V1.add("A");
		V1.add("B");
		V1.add("C");
		V1.add("z");
		V1.add("D");
		
		V1.add("E");
		V1.add("F");
		V1.add("G");
		V1.add("H");
		V1.add("I");
		V1.add("J");
		V1.add("K");
		V1.add(3, "D");
		System.out.println(V1);
		System.out.println(V1.size());
		System.out.println(V1.capacity());
		
		}
	}
	
	

