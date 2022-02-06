package p1;

import org.testng.annotations.Test;


public class c1 {
	

	@Test
	public void m1() {
		
		TestData testdata = new TestData();
		System.out.println(testdata.properties.getProperty("deployment"));
		
		
		
	}
	
	

}
