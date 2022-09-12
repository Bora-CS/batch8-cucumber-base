package pojo;

public class EducationData {

	// |shcool|degrdd|field |from      |to        |description
	// |Bora  |No    |CS    |01/01/2022|01/01/2022|I don't want to write anything|

	public String school;
	public String degree;
	public String field;
	public String from;
	public String to;
	public String description;

	public EducationData(String school, String degree, String field, String form, String to) {

		this.school = school;
		this.degree = degree;
		this.field = field;
		this.from = from;
		this.to = to;
		this.description = description;

	}

	public EducationData get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
