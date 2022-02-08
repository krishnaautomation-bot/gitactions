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
		FileWriter file = new FileWriter("temp/beforemigration.json");
		file.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file.flush();
		file.close();
	}
	
	@Given("I want to write a step after migration")
	public void i_want_to_write_a_step_after_migration() throws IOException {
		FileWriter file = new FileWriter("temp/aftermigration.json");
		file.write("asdfasdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdfasdf asdfasdfasdfasdfasdfasdf");
		file.flush();
		file.close();
	}
	
	@Given("validate both the json files")
	public void validate_both_the_json_files() throws JSONException, IOException {
		File dir = new File(".");
		FileFilter fileFilter = new WildcardFileFilter("*.json");
		File[] files = dir.listFiles(fileFilter);
		String aftermigrationjson = FileUtils.readFileToString(files[1]);

		
		File file1 = new File("beforemigration.json");
		
		
		String beforemigrationjson = FileUtils.readFileToString(file1);		
		
	    JSONAssert.assertEquals(beforemigrationjson, aftermigrationjson, false);
	}

}
