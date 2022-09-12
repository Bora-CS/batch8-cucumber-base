package dataTransfrorm;

import java.util.Map;

import io.cucumber.java.DataTableType;
import pojo.EducationData;

public class Educationtransform {

	
	//1.convert the cucumber DataTable into Map/Object
	
	@DataTableType
	public void educationTransform(Map<String,String>cucumberDataTable) {
	
		Map<String,String> edu = io.cucumber.datatable.DataTableType.asMaps().get(0);
	
	EducationData deuData = new EducationData(cucumberDataTable.get("school"),cucumberDataTable.get(edu),cucumberDataTable.get("form"),cucumberDataTable.get("to"),cucumberDataTable.get("Description"));
		
	}
}
