package dataTransform;

import java.util.Map;

import io.cucumber.java.DataTableType;
import pojo.ExpirencePojo;

public class ExpirenceTansform {
	
	
	
	
	//1. convert the Cucumber DataTable into Map/Object
	
	//2. Put the map value into custom pojo class
	
//	|company|title|location|from      |to        |current |description                   |

	
	
	// it receive the data from Feature file  - Cucumber dataTable
	// it return data as Step needed          - Custom Pojo class
	@DataTableType
	public ExpirencePojo convertExpirence(Map<String,String> expMap) {
		
		ExpirencePojo exPojo = new ExpirencePojo(expMap.get("company"), expMap.get("title"), expMap.get("location"),
				expMap.get("from"), expMap.get("to"),
				Boolean.valueOf(expMap.get("current")), expMap.get("description"));
		
		return exPojo;

	}
	

}
