package pojo;

public class Experience {
	
	public String title;
	public String company;
	public String location;
	public String from;
	public String current;
	public String to;
	public String description;
	
	@Override
	public String toString() {
		return "Experiences: " + this.title + " " + this.company + " " + this.location + " " + this.from + " " + this.current + " " + this.to + " " + 
	this.description;
	}

	public Experience(String title, String company, String location, String from, String current, String to,
			String description) {
		this.title = title;
		this.company = company;
		this.location = location;
		this.from = from;
		;
		this.current = current;
		this.to = to;
		this.description = description;

	}








}
