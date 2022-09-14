package dataTransform;

import java.util.Map;

import io.cucumber.java.DataTableType;
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
