package pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EducationData {
	
	
//	|school  |degree|field|from      |to        |Description                   |
//	|Bora	 |No    |CS   |01/01/2021|01/01/2022|I don't want to write anything|

	public String school;
	public String degree;
	public String field;
	public String from;
	public String to;
	public String description;
	
	public EducationData(String school, String degree, 
			String field, String from, String to, String passedDescription) {
		
		this.school = "Bora";
		this.degree = degree;
		this.field = field;
		this.from = from;
		this.to = to;
		description = passedDescription;
		
		
	}
	
	
	
	void updateDate() throws ParseException {
		// change format from MM/DD/YYYY -> YYYY-MM-DD
		
		String[] dates = from.split("/");
		from = dates[2]+"-"+dates[0]+"-"+dates[1];
		
		//  MM -> 09, MMM-> Sep, MMMMM -> September
		//  YY -> 22, YYYY-> 2022
		//  Time -> HH-hour mm-minute s-Second
		SimpleDateFormat d = new SimpleDateFormat("MM/dd/YYYY");
				
		Date day = d.parse(from);
		d.applyPattern("YYYY-MM-dd");
		String newDate = d.format(day);

	}
	
	void validateDate() {
		// validaete the from is eailer than to
		// if not, I will set dfault value    2020 - 2022
	}
	
	

}
