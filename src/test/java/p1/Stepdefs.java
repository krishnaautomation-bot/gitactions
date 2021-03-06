package p1;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import io.cucumber.java.en.Given;

public class Stepdefs {
	
	@Given("I want to write a step before migration")
	public void i_want_to_write_a_step_before_migration() throws IOException {
		FileWriter file = new FileWriter("beforemigration1.json");
		file.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file.flush();
		file.close();
		FileWriter file1 = new FileWriter("beforemigration1.json");
		file1.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file1.flush();
		file1.close();
		FileWriter file2 = new FileWriter("beforemigration2.json");
		file2.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file2.flush();
		file2.close();
		FileWriter file3 = new FileWriter("beforemigration3.json");
		file3.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file3.flush();
		file3.close();
		FileWriter file4 = new FileWriter("beforemigration4.json");
		file4.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file4.flush();
		file4.close();
		FileWriter file5 = new FileWriter("beforemigration5.json");
		file5.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file5.flush();
		file5.close();
		FileWriter file6 = new FileWriter("beforemigration6.json");
		file6.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file6.flush();
		file6.close();
		FileWriter file7 = new FileWriter("beforemigration7.json");
		file7.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file7.flush();
		file7.close();
	}
	
	@Given("I want to write a step after migration")
	public void i_want_to_write_a_step_after_migration() throws IOException {
		FileWriter file = new FileWriter("aftermigration.json");
		file.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file.flush();
		file.close();
	}
	
	@Given("validate both the json files")
	public void validate_both_the_json_files() throws JSONException, IOException {
		File dir = new File(".");
		FileFilter fileFilter = new WildcardFileFilter("*.json");
		File[] files = dir.listFiles(fileFilter);
		String aftermigrationjson = FileUtils.readFileToString(files[0]);

		
		File file1 = new File("beforemigration.json");
		
		
		String beforemigrationjson = FileUtils.readFileToString(file1);		
		
	    JSONAssert.assertEquals(beforemigrationjson, aftermigrationjson, false);
	}

}
