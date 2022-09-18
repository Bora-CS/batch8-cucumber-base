package pojo;

public class ExpirencePojo {
	
	
	
//	|company|title|location|from      |to        |current |description                   |
//	|Bora	  |SDET |VA      |01/01/2020|01/01/2022|false   |I don't want to write anything|

	String company;
	String title;
	String location;
	String from;
	String to;
	boolean current;
	String description;
	
	public ExpirencePojo(String company, String title, String location, 
			String from, String to, boolean current, String description) {
		
		this.company = company;
		this.title = title;
		this.location = location;
		this.from = from;
		this.to = to;
		this.current = current;
		this.description = description;
	
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String newValue) {
		this.company = newValue;
	}
	
	public String getTitle() {
		return title;
	}
	public String getLocation() {
		return location;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public boolean getCurrent() {
		return current;
	}
	public String getDescription() {
		return description;
	}
	
	
	
}
