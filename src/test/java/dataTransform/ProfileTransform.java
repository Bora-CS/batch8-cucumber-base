package dataTransform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;

public class ProfileTransform {
	
	
	@DataTableType
	public HashMap<String, String> convertProfile(List<String> table) {

		HashMap<String, String> bodyData = new HashMap<>();
//		List<List<String>> datas = table.asLists();	
		System.out.println("Data is the transform: "+table.toString());

		
		
		
//		for (List<String> data : datas) {
//			bodyData.put(data.get(0), data.get(1));
//		}

		return bodyData;
	}

}
