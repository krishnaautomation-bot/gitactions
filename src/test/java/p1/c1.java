package p1;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;


public class c1 {
	

	@Test
	public void m1() throws IOException {
		
		TestData testdata = new TestData();
		System.out.println(testdata.properties.getProperty("deployment"));
		FileWriter file = new FileWriter("temp/"+RandomStringUtils.randomAlphanumeric(10)+".json");
		file.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file.flush();
		file.close();
		
		
	}
	
	

}
