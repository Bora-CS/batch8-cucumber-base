package dataTransform;

import java.util.Map;

import io.cucumber.java.DataTableType;
<<<<<<< HEAD
import pojo.Education;

public class EducationTransform {
	@DataTableType
	public Education educationConvert(Map<String, String> entry) {
		Education education = new Education(Boolean.valueOf(entry.get("current")), entry.get("_id"),
				entry.get("school"), entry.get("degree"), entry.get("fieldofstudy"), entry.get("from"), entry.get("to"),
				entry.get("description"));
		return education;
	}
}
=======
import pojo.EducationData;

public class EducationTransform {
	
	
	
	// Transfer the Cucumber DataTable to the Custom pojo class
	// receive Cucumber data    
	// return pojo class
		
	@DataTableType
	public EducationData educationTransform(Map<String,String> cucumberDataTable){
			
		
		// 1. Transfer Cucumber dataTable to the map
//		Map<String,String> cucumberDataTable = dataTable.asMaps().get(0);

		
		// 2. Put the map value into the pojo class
		EducationData eduData = new EducationData(cucumberDataTable.get("school"), cucumberDataTable.get("degree"), cucumberDataTable.get("field"),
				cucumberDataTable.get("from"), cucumberDataTable.get("to"), cucumberDataTable.get("Description"));
		
		return eduData;
		
	}
	
	

}
>>>>>>> origin/batch8.1_Master
